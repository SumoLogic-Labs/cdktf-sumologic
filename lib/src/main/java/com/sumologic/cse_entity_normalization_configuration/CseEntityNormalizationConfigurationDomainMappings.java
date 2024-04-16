package com.sumologic.cse_entity_normalization_configuration;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.687Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseEntityNormalizationConfiguration.CseEntityNormalizationConfigurationDomainMappings")
@software.amazon.jsii.Jsii.Proxy(CseEntityNormalizationConfigurationDomainMappings.Jsii$Proxy.class)
public interface CseEntityNormalizationConfigurationDomainMappings extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalized_domain CseEntityNormalizationConfiguration#normalized_domain}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNormalizedDomain();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#raw_domain CseEntityNormalizationConfiguration#raw_domain}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRawDomain();

    /**
     * @return a {@link Builder} of {@link CseEntityNormalizationConfigurationDomainMappings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseEntityNormalizationConfigurationDomainMappings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseEntityNormalizationConfigurationDomainMappings> {
        java.lang.String normalizedDomain;
        java.lang.String rawDomain;

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationDomainMappings#getNormalizedDomain}
         * @param normalizedDomain Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalized_domain CseEntityNormalizationConfiguration#normalized_domain}. This parameter is required.
         * @return {@code this}
         */
        public Builder normalizedDomain(java.lang.String normalizedDomain) {
            this.normalizedDomain = normalizedDomain;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationDomainMappings#getRawDomain}
         * @param rawDomain Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#raw_domain CseEntityNormalizationConfiguration#raw_domain}. This parameter is required.
         * @return {@code this}
         */
        public Builder rawDomain(java.lang.String rawDomain) {
            this.rawDomain = rawDomain;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseEntityNormalizationConfigurationDomainMappings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseEntityNormalizationConfigurationDomainMappings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseEntityNormalizationConfigurationDomainMappings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseEntityNormalizationConfigurationDomainMappings {
        private final java.lang.String normalizedDomain;
        private final java.lang.String rawDomain;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.normalizedDomain = software.amazon.jsii.Kernel.get(this, "normalizedDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rawDomain = software.amazon.jsii.Kernel.get(this, "rawDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.normalizedDomain = java.util.Objects.requireNonNull(builder.normalizedDomain, "normalizedDomain is required");
            this.rawDomain = java.util.Objects.requireNonNull(builder.rawDomain, "rawDomain is required");
        }

        @Override
        public final java.lang.String getNormalizedDomain() {
            return this.normalizedDomain;
        }

        @Override
        public final java.lang.String getRawDomain() {
            return this.rawDomain;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("normalizedDomain", om.valueToTree(this.getNormalizedDomain()));
            data.set("rawDomain", om.valueToTree(this.getRawDomain()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseEntityNormalizationConfiguration.CseEntityNormalizationConfigurationDomainMappings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseEntityNormalizationConfigurationDomainMappings.Jsii$Proxy that = (CseEntityNormalizationConfigurationDomainMappings.Jsii$Proxy) o;

            if (!normalizedDomain.equals(that.normalizedDomain)) return false;
            return this.rawDomain.equals(that.rawDomain);
        }

        @Override
        public final int hashCode() {
            int result = this.normalizedDomain.hashCode();
            result = 31 * result + (this.rawDomain.hashCode());
            return result;
        }
    }
}
