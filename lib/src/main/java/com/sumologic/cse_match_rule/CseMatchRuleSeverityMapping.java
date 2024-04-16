package com.sumologic.cse_match_rule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.763Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseMatchRule.CseMatchRuleSeverityMapping")
@software.amazon.jsii.Jsii.Proxy(CseMatchRuleSeverityMapping.Jsii$Proxy.class)
public interface CseMatchRuleSeverityMapping extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#type CseMatchRule#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#default CseMatchRule#default}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDefaultValue() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#field CseMatchRule#field}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getField() {
        return null;
    }

    /**
     * mapping block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#mapping CseMatchRule#mapping}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMapping() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseMatchRuleSeverityMapping}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseMatchRuleSeverityMapping}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseMatchRuleSeverityMapping> {
        java.lang.String type;
        java.lang.Number defaultValue;
        java.lang.String field;
        java.lang.Object mapping;

        /**
         * Sets the value of {@link CseMatchRuleSeverityMapping#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#type CseMatchRule#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CseMatchRuleSeverityMapping#getDefaultValue}
         * @param defaultValue Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#default CseMatchRule#default}.
         * @return {@code this}
         */
        public Builder defaultValue(java.lang.Number defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Sets the value of {@link CseMatchRuleSeverityMapping#getField}
         * @param field Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#field CseMatchRule#field}.
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Sets the value of {@link CseMatchRuleSeverityMapping#getMapping}
         * @param mapping mapping block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#mapping CseMatchRule#mapping}
         * @return {@code this}
         */
        public Builder mapping(com.hashicorp.cdktf.IResolvable mapping) {
            this.mapping = mapping;
            return this;
        }

        /**
         * Sets the value of {@link CseMatchRuleSeverityMapping#getMapping}
         * @param mapping mapping block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#mapping CseMatchRule#mapping}
         * @return {@code this}
         */
        public Builder mapping(java.util.List<? extends com.sumologic.cse_match_rule.CseMatchRuleSeverityMappingMapping> mapping) {
            this.mapping = mapping;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseMatchRuleSeverityMapping}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseMatchRuleSeverityMapping build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseMatchRuleSeverityMapping}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseMatchRuleSeverityMapping {
        private final java.lang.String type;
        private final java.lang.Number defaultValue;
        private final java.lang.String field;
        private final java.lang.Object mapping;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultValue = software.amazon.jsii.Kernel.get(this, "default", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mapping = software.amazon.jsii.Kernel.get(this, "mapping", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.defaultValue = builder.defaultValue;
            this.field = builder.field;
            this.mapping = builder.mapping;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Number getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        public final java.lang.Object getMapping() {
            return this.mapping;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getDefaultValue() != null) {
                data.set("default", om.valueToTree(this.getDefaultValue()));
            }
            if (this.getField() != null) {
                data.set("field", om.valueToTree(this.getField()));
            }
            if (this.getMapping() != null) {
                data.set("mapping", om.valueToTree(this.getMapping()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseMatchRule.CseMatchRuleSeverityMapping"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseMatchRuleSeverityMapping.Jsii$Proxy that = (CseMatchRuleSeverityMapping.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.defaultValue != null ? !this.defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
            if (this.field != null ? !this.field.equals(that.field) : that.field != null) return false;
            return this.mapping != null ? this.mapping.equals(that.mapping) : that.mapping == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.defaultValue != null ? this.defaultValue.hashCode() : 0);
            result = 31 * result + (this.field != null ? this.field.hashCode() : 0);
            result = 31 * result + (this.mapping != null ? this.mapping.hashCode() : 0);
            return result;
        }
    }
}
