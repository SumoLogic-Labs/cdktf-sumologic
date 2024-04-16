package com.sumologic.cse_match_rule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.762Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseMatchRule.CseMatchRuleEntitySelectors")
@software.amazon.jsii.Jsii.Proxy(CseMatchRuleEntitySelectors.Jsii$Proxy.class)
public interface CseMatchRuleEntitySelectors extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#entity_type CseMatchRule#entity_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEntityType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#expression CseMatchRule#expression}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getExpression();

    /**
     * @return a {@link Builder} of {@link CseMatchRuleEntitySelectors}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseMatchRuleEntitySelectors}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseMatchRuleEntitySelectors> {
        java.lang.String entityType;
        java.lang.String expression;

        /**
         * Sets the value of {@link CseMatchRuleEntitySelectors#getEntityType}
         * @param entityType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#entity_type CseMatchRule#entity_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder entityType(java.lang.String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * Sets the value of {@link CseMatchRuleEntitySelectors#getExpression}
         * @param expression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_rule#expression CseMatchRule#expression}. This parameter is required.
         * @return {@code this}
         */
        public Builder expression(java.lang.String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseMatchRuleEntitySelectors}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseMatchRuleEntitySelectors build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseMatchRuleEntitySelectors}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseMatchRuleEntitySelectors {
        private final java.lang.String entityType;
        private final java.lang.String expression;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.entityType = software.amazon.jsii.Kernel.get(this, "entityType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.expression = software.amazon.jsii.Kernel.get(this, "expression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.entityType = java.util.Objects.requireNonNull(builder.entityType, "entityType is required");
            this.expression = java.util.Objects.requireNonNull(builder.expression, "expression is required");
        }

        @Override
        public final java.lang.String getEntityType() {
            return this.entityType;
        }

        @Override
        public final java.lang.String getExpression() {
            return this.expression;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("entityType", om.valueToTree(this.getEntityType()));
            data.set("expression", om.valueToTree(this.getExpression()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseMatchRule.CseMatchRuleEntitySelectors"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseMatchRuleEntitySelectors.Jsii$Proxy that = (CseMatchRuleEntitySelectors.Jsii$Proxy) o;

            if (!entityType.equals(that.entityType)) return false;
            return this.expression.equals(that.expression);
        }

        @Override
        public final int hashCode() {
            int result = this.entityType.hashCode();
            result = 31 * result + (this.expression.hashCode());
            return result;
        }
    }
}
