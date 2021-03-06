package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public Result index() {
        return ok("Hello, world!");
    }

    public Result hello(String name) {
        return ok(views.html.hello.render(name));
    }

}
