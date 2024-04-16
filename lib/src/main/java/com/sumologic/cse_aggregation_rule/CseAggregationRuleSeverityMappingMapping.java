package com.sumologic.cse_aggregation_rule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.619Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseAggregationRule.CseAggregationRuleSeverityMappingMapping")
@software.amazon.jsii.Jsii.Proxy(CseAggregationRuleSeverityMappingMapping.Jsii$Proxy.class)
public interface CseAggregationRuleSeverityMappingMapping extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#from CseAggregationRule#from}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFrom();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#to CseAggregationRule#to}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getTo();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#type CseAggregationRule#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link CseAggregationRuleSeverityMappingMapping}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseAggregationRuleSeverityMappingMapping}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseAggregationRuleSeverityMappingMapping> {
        java.lang.String from;
        java.lang.Number to;
        java.lang.String type;

        /**
         * Sets the value of {@link CseAggregationRuleSeverityMappingMapping#getFrom}
         * @param from Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#from CseAggregationRule#from}. This parameter is required.
         * @return {@code this}
         */
        public Builder from(java.lang.String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleSeverityMappingMapping#getTo}
         * @param to Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#to CseAggregationRule#to}. This parameter is required.
         * @return {@code this}
         */
        public Builder to(java.lang.Number to) {
            this.to = to;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleSeverityMappingMapping#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#type CseAggregationRule#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseAggregationRuleSeverityMappingMapping}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseAggregationRuleSeverityMappingMapping build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseAggregationRuleSeverityMappingMapping}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseAggregationRuleSeverityMappingMapping {
        private final java.lang.String from;
        private final java.lang.Number to;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.from = software.amazon.jsii.Kernel.get(this, "from", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.to = software.amazon.jsii.Kernel.get(this, "to", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.from = java.util.Objects.requireNonNull(builder.from, "from is required");
            this.to = java.util.Objects.requireNonNull(builder.to, "to is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
        }

        @Override
        public final java.lang.String getFrom() {
            return this.from;
        }

        @Override
        public final java.lang.Number getTo() {
            return this.to;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("from", om.valueToTree(this.getFrom()));
            data.set("to", om.valueToTree(this.getTo()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseAggregationRule.CseAggregationRuleSeverityMappingMapping"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseAggregationRuleSeverityMappingMapping.Jsii$Proxy that = (CseAggregationRuleSeverityMappingMapping.Jsii$Proxy) o;

            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.from.hashCode();
            result = 31 * result + (this.to.hashCode());
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
