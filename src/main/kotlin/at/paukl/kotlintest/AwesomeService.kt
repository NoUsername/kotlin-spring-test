package at.paukl.kotlintest

import org.springframework.stereotype.Service
import java.util.*

@Service
class AwesomeService {

    fun getAwesome():String {
        return "awesooooome " + UUID.randomUUID().toString();
    }

}