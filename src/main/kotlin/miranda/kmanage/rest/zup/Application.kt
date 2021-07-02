package miranda.kmanage.rest.zup

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("miranda.kmanage.rest.zup")
		.start()
}

