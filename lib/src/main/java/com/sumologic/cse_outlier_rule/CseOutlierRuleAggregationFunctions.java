package com.sumologic.cse_outlier_rule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.774Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseOutlierRule.CseOutlierRuleAggregationFunctions")
@software.amazon.jsii.Jsii.Proxy(CseOutlierRuleAggregationFunctions.Jsii$Proxy.class)
public interface CseOutlierRuleAggregationFunctions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#arguments CseOutlierRule#arguments}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getArguments();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#function CseOutlierRule#function}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFunction();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#name CseOutlierRule#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link CseOutlierRuleAggregationFunctions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseOutlierRuleAggregationFunctions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseOutlierRuleAggregationFunctions> {
        java.util.List<java.lang.String> arguments;
        java.lang.String function;
        java.lang.String name;

        /**
         * Sets the value of {@link CseOutlierRuleAggregationFunctions#getArguments}
         * @param arguments Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#arguments CseOutlierRule#arguments}. This parameter is required.
         * @return {@code this}
         */
        public Builder arguments(java.util.List<java.lang.String> arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
         * Sets the value of {@link CseOutlierRuleAggregationFunctions#getFunction}
         * @param function Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#function CseOutlierRule#function}. This parameter is required.
         * @return {@code this}
         */
        public Builder function(java.lang.String function) {
            this.function = function;
            return this;
        }

        /**
         * Sets the value of {@link CseOutlierRuleAggregationFunctions#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#name CseOutlierRule#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseOutlierRuleAggregationFunctions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseOutlierRuleAggregationFunctions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseOutlierRuleAggregationFunctions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseOutlierRuleAggregationFunctions {
        private final java.util.List<java.lang.String> arguments;
        private final java.lang.String function;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.arguments = software.amazon.jsii.Kernel.get(this, "arguments", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.function = software.amazon.jsii.Kernel.get(this, "function", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.arguments = java.util.Objects.requireNonNull(builder.arguments, "arguments is required");
            this.function = java.util.Objects.requireNonNull(builder.function, "function is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
        }

        @Override
        public final java.util.List<java.lang.String> getArguments() {
            return this.arguments;
        }

        @Override
        public final java.lang.String getFunction() {
            return this.function;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("arguments", om.valueToTree(this.getArguments()));
            data.set("function", om.valueToTree(this.getFunction()));
            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseOutlierRule.CseOutlierRuleAggregationFunctions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseOutlierRuleAggregationFunctions.Jsii$Proxy that = (CseOutlierRuleAggregationFunctions.Jsii$Proxy) o;

            if (!arguments.equals(that.arguments)) return false;
            if (!function.equals(that.function)) return false;
            return this.name.equals(that.name);
        }

        @Override
        public final int hashCode() {
            int result = this.arguments.hashCode();
            result = 31 * result + (this.function.hashCode());
            result = 31 * result + (this.name.hashCode());
            return result;
        }
    }
}
