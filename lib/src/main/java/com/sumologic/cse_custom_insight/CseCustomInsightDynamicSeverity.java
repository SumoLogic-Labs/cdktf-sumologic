package com.sumologic.cse_custom_insight;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.668Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseCustomInsight.CseCustomInsightDynamicSeverity")
@software.amazon.jsii.Jsii.Proxy(CseCustomInsightDynamicSeverity.Jsii$Proxy.class)
public interface CseCustomInsightDynamicSeverity extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#insight_severity CseCustomInsight#insight_severity}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getInsightSeverity();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#minimum_signal_severity CseCustomInsight#minimum_signal_severity}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMinimumSignalSeverity();

    /**
     * @return a {@link Builder} of {@link CseCustomInsightDynamicSeverity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseCustomInsightDynamicSeverity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseCustomInsightDynamicSeverity> {
        java.lang.String insightSeverity;
        java.lang.Number minimumSignalSeverity;

        /**
         * Sets the value of {@link CseCustomInsightDynamicSeverity#getInsightSeverity}
         * @param insightSeverity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#insight_severity CseCustomInsight#insight_severity}. This parameter is required.
         * @return {@code this}
         */
        public Builder insightSeverity(java.lang.String insightSeverity) {
            this.insightSeverity = insightSeverity;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightDynamicSeverity#getMinimumSignalSeverity}
         * @param minimumSignalSeverity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#minimum_signal_severity CseCustomInsight#minimum_signal_severity}. This parameter is required.
         * @return {@code this}
         */
        public Builder minimumSignalSeverity(java.lang.Number minimumSignalSeverity) {
            this.minimumSignalSeverity = minimumSignalSeverity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseCustomInsightDynamicSeverity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseCustomInsightDynamicSeverity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseCustomInsightDynamicSeverity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseCustomInsightDynamicSeverity {
        private final java.lang.String insightSeverity;
        private final java.lang.Number minimumSignalSeverity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.insightSeverity = software.amazon.jsii.Kernel.get(this, "insightSeverity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minimumSignalSeverity = software.amazon.jsii.Kernel.get(this, "minimumSignalSeverity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.insightSeverity = java.util.Objects.requireNonNull(builder.insightSeverity, "insightSeverity is required");
            this.minimumSignalSeverity = java.util.Objects.requireNonNull(builder.minimumSignalSeverity, "minimumSignalSeverity is required");
        }

        @Override
        public final java.lang.String getInsightSeverity() {
            return this.insightSeverity;
        }

        @Override
        public final java.lang.Number getMinimumSignalSeverity() {
            return this.minimumSignalSeverity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("insightSeverity", om.valueToTree(this.getInsightSeverity()));
            data.set("minimumSignalSeverity", om.valueToTree(this.getMinimumSignalSeverity()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseCustomInsight.CseCustomInsightDynamicSeverity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseCustomInsightDynamicSeverity.Jsii$Proxy that = (CseCustomInsightDynamicSeverity.Jsii$Proxy) o;

            if (!insightSeverity.equals(that.insightSeverity)) return false;
            return this.minimumSignalSeverity.equals(that.minimumSignalSeverity);
        }

        @Override
        public final int hashCode() {
            int result = this.insightSeverity.hashCode();
            result = 31 * result + (this.minimumSignalSeverity.hashCode());
            return result;
        }
    }
}
