package com.sumologic.cse_chain_rule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.650Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseChainRule.CseChainRuleExpressionsAndLimits")
@software.amazon.jsii.Jsii.Proxy(CseChainRuleExpressionsAndLimits.Jsii$Proxy.class)
public interface CseChainRuleExpressionsAndLimits extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#expression CseChainRule#expression}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getExpression();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#limit CseChainRule#limit}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getLimit();

    /**
     * @return a {@link Builder} of {@link CseChainRuleExpressionsAndLimits}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseChainRuleExpressionsAndLimits}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseChainRuleExpressionsAndLimits> {
        java.lang.String expression;
        java.lang.Number limit;

        /**
         * Sets the value of {@link CseChainRuleExpressionsAndLimits#getExpression}
         * @param expression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#expression CseChainRule#expression}. This parameter is required.
         * @return {@code this}
         */
        public Builder expression(java.lang.String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleExpressionsAndLimits#getLimit}
         * @param limit Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#limit CseChainRule#limit}. This parameter is required.
         * @return {@code this}
         */
        public Builder limit(java.lang.Number limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseChainRuleExpressionsAndLimits}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseChainRuleExpressionsAndLimits build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseChainRuleExpressionsAndLimits}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseChainRuleExpressionsAndLimits {
        private final java.lang.String expression;
        private final java.lang.Number limit;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.expression = software.amazon.jsii.Kernel.get(this, "expression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.limit = software.amazon.jsii.Kernel.get(this, "limit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.expression = java.util.Objects.requireNonNull(builder.expression, "expression is required");
            this.limit = java.util.Objects.requireNonNull(builder.limit, "limit is required");
        }

        @Override
        public final java.lang.String getExpression() {
            return this.expression;
        }

        @Override
        public final java.lang.Number getLimit() {
            return this.limit;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("expression", om.valueToTree(this.getExpression()));
            data.set("limit", om.valueToTree(this.getLimit()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseChainRule.CseChainRuleExpressionsAndLimits"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseChainRuleExpressionsAndLimits.Jsii$Proxy that = (CseChainRuleExpressionsAndLimits.Jsii$Proxy) o;

            if (!expression.equals(that.expression)) return false;
            return this.limit.equals(that.limit);
        }

        @Override
        public final int hashCode() {
            int result = this.expression.hashCode();
            result = 31 * result + (this.limit.hashCode());
            return result;
        }
    }
}
