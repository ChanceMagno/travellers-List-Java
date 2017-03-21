import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.List;
import java.util.ArrayList;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("places", request.session().attribute("places"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/places", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<PlacesVisited> places = request.session().attribute("places");
      if (places == null) {
        places = new ArrayList<PlacesVisited>();
        request.session().attribute("places", places);
      }

      String countryVisited = request.queryParams("countryVisited");
      String cityVisited = request.queryParams("cityVisited");
      PlacesVisited newPlace = new PlacesVisited(countryVisited, cityVisited);
      places.add(newPlace);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
