package com.sumologic.cloudfront_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.473Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cloudfrontSource.CloudfrontSourcePathSnsTopicOrSubscriptionArn")
@software.amazon.jsii.Jsii.Proxy(CloudfrontSourcePathSnsTopicOrSubscriptionArn.Jsii$Proxy.class)
public interface CloudfrontSourcePathSnsTopicOrSubscriptionArn extends software.amazon.jsii.JsiiSerializable {

    /**
     * @return a {@link Builder} of {@link CloudfrontSourcePathSnsTopicOrSubscriptionArn}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontSourcePathSnsTopicOrSubscriptionArn}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontSourcePathSnsTopicOrSubscriptionArn> {

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontSourcePathSnsTopicOrSubscriptionArn}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontSourcePathSnsTopicOrSubscriptionArn build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontSourcePathSnsTopicOrSubscriptionArn}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontSourcePathSnsTopicOrSubscriptionArn {

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();


            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cloudfrontSource.CloudfrontSourcePathSnsTopicOrSubscriptionArn"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }
    }
}
