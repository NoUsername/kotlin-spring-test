package at.paukl.kotlintest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class TestController @Autowired constructor(val service: AwesomeService) {

    @RequestMapping("/")
    fun findAll() = service.getAwesome()

    @RequestMapping("/{name}")
    fun findByLastName(@PathVariable name: String)
            = "hello " + name;

    @RequestMapping("/json/{name}")
    @ResponseBody
    fun testJson(@PathVariable name: String): TestDto {
        return TestDto(name, 10)
    }

    @RequestMapping("/json/{name}", method = arrayOf(RequestMethod.POST))
    @ResponseBody
    fun testJson(@RequestBody data: TestDto): String {
        return "got name " + data.name + " and age: " + data.age;
    }

}