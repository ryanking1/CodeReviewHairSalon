import org.junit.*;
import static org.junit.Assert.*;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import java.util.ArrayList;

import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @Rule
  public DatabaseRule database = new DatabaseRule();


  @ClassRule
  public static ServerRule server = new ServerRule();

//   @Test
// public void categoryIsCreatedTest() {
//     goTo("http://localhost:4567/");
//     fill("#categoryName").with("Household");
//     submit(".btn-primary");
//     assertThat(pageSource()).contains("Household");
// }
//
// @Test
// public void taskIsCreatedTest() {
//     goTo("http://localhost:4567/");
//     Category myCategory = new Category("Household");
//     myCategory.save();
//     String categoryPath = String.format("http://localhost:4567/%d", myCategory.getId());
//     goTo(categoryPath);
//     assertThat(pageSource()).contains("Household");
//     Task tasks = new Task("Mow the lawn", myCategory.getId());
//     tasks.save();
//     goTo(categoryPath);
//     assertThat(pageSource()).contains("Mow the lawn");
// }
// @Test
// public void categoryIsDeletedTest() {
//   String path = "http://localhost:4567/";
//   goTo(path);
//   Category myCategory = new Category("Household");
//   myCategory.save();
//   goTo(path);
//   myCategory.deleteCategory(myCategory.getId());
//   goTo(path);
//   assertThat((pageSource()).contains("Household") == false);
//
// }
// @Test
// public void taskIsDeletedTest() {
//   goTo("http://localhost:4567/");
//   Category myCategory = new Category("Household");
//   myCategory.save();
//   String categoryPath = String.format("http://localhost:4567/%d", myCategory.getId());
//   goTo(categoryPath);
//   assertThat(pageSource()).contains("Household");
//   Task tasks = new Task("Mow the lawn", myCategory.getId());
//   tasks.save();
//   goTo(categoryPath);
//   assertThat(pageSource()).contains("Mow the lawn");
//   tasks.delete(tasks.getId());
//   goTo(categoryPath);
//   assertThat((pageSource()).contains("Mow the lawn") == false);
// }
}
