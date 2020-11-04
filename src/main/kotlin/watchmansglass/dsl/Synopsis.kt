package watchmansglass.dsl

import watchmansglass.data.raw.Synopsis
import watchmansglass.dsl.internal.*

@ModDsl
class SynopsisBuilder(override val t: Synopsis = Synopsis()) : Builder<Synopsis> {

    var name by t::name
    var author by t::author
    var version by t::version
    var description by t::description
    var descriptionLong by t::description_long
    val dependencies by builder(t::dependencies, ::ListBuilder)
    
}