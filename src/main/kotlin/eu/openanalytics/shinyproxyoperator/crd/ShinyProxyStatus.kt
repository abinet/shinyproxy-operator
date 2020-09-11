package eu.openanalytics.shinyproxyoperator.crd

import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.fabric8.kubernetes.api.model.KubernetesResource


@JsonDeserialize(using = JsonDeserializer.None::class)
class ShinyProxyStatus : KubernetesResource {

    // TODO

}
