package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.828Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelColoringRule")
@software.amazon.jsii.Jsii.Proxy(DashboardPanelSumoSearchPanelColoringRule.Jsii$Proxy.class)
public interface DashboardPanelSumoSearchPanelColoringRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#multiple_series_aggregate_function Dashboard#multiple_series_aggregate_function}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMultipleSeriesAggregateFunction();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#scope Dashboard#scope}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getScope();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#single_series_aggregate_function Dashboard#single_series_aggregate_function}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSingleSeriesAggregateFunction();

    /**
     * color_threshold block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#color_threshold Dashboard#color_threshold}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getColorThreshold() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardPanelSumoSearchPanelColoringRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanelSumoSearchPanelColoringRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanelSumoSearchPanelColoringRule> {
        java.lang.String multipleSeriesAggregateFunction;
        java.lang.String scope;
        java.lang.String singleSeriesAggregateFunction;
        java.lang.Object colorThreshold;

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelColoringRule#getMultipleSeriesAggregateFunction}
         * @param multipleSeriesAggregateFunction Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#multiple_series_aggregate_function Dashboard#multiple_series_aggregate_function}. This parameter is required.
         * @return {@code this}
         */
        public Builder multipleSeriesAggregateFunction(java.lang.String multipleSeriesAggregateFunction) {
            this.multipleSeriesAggregateFunction = multipleSeriesAggregateFunction;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelColoringRule#getScope}
         * @param scope Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#scope Dashboard#scope}. This parameter is required.
         * @return {@code this}
         */
        public Builder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelColoringRule#getSingleSeriesAggregateFunction}
         * @param singleSeriesAggregateFunction Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#single_series_aggregate_function Dashboard#single_series_aggregate_function}. This parameter is required.
         * @return {@code this}
         */
        public Builder singleSeriesAggregateFunction(java.lang.String singleSeriesAggregateFunction) {
            this.singleSeriesAggregateFunction = singleSeriesAggregateFunction;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelColoringRule#getColorThreshold}
         * @param colorThreshold color_threshold block.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#color_threshold Dashboard#color_threshold}
         * @return {@code this}
         */
        public Builder colorThreshold(com.hashicorp.cdktf.IResolvable colorThreshold) {
            this.colorThreshold = colorThreshold;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelColoringRule#getColorThreshold}
         * @param colorThreshold color_threshold block.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#color_threshold Dashboard#color_threshold}
         * @return {@code this}
         */
        public Builder colorThreshold(java.util.List<? extends com.sumologic.dashboard.DashboardPanelSumoSearchPanelColoringRuleColorThreshold> colorThreshold) {
            this.colorThreshold = colorThreshold;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanelSumoSearchPanelColoringRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanelSumoSearchPanelColoringRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanelSumoSearchPanelColoringRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanelSumoSearchPanelColoringRule {
        private final java.lang.String multipleSeriesAggregateFunction;
        private final java.lang.String scope;
        private final java.lang.String singleSeriesAggregateFunction;
        private final java.lang.Object colorThreshold;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.multipleSeriesAggregateFunction = software.amazon.jsii.Kernel.get(this, "multipleSeriesAggregateFunction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scope = software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.singleSeriesAggregateFunction = software.amazon.jsii.Kernel.get(this, "singleSeriesAggregateFunction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.colorThreshold = software.amazon.jsii.Kernel.get(this, "colorThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.multipleSeriesAggregateFunction = java.util.Objects.requireNonNull(builder.multipleSeriesAggregateFunction, "multipleSeriesAggregateFunction is required");
            this.scope = java.util.Objects.requireNonNull(builder.scope, "scope is required");
            this.singleSeriesAggregateFunction = java.util.Objects.requireNonNull(builder.singleSeriesAggregateFunction, "singleSeriesAggregateFunction is required");
            this.colorThreshold = builder.colorThreshold;
        }

        @Override
        public final java.lang.String getMultipleSeriesAggregateFunction() {
            return this.multipleSeriesAggregateFunction;
        }

        @Override
        public final java.lang.String getScope() {
            return this.scope;
        }

        @Override
        public final java.lang.String getSingleSeriesAggregateFunction() {
            return this.singleSeriesAggregateFunction;
        }

        @Override
        public final java.lang.Object getColorThreshold() {
            return this.colorThreshold;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("multipleSeriesAggregateFunction", om.valueToTree(this.getMultipleSeriesAggregateFunction()));
            data.set("scope", om.valueToTree(this.getScope()));
            data.set("singleSeriesAggregateFunction", om.valueToTree(this.getSingleSeriesAggregateFunction()));
            if (this.getColorThreshold() != null) {
                data.set("colorThreshold", om.valueToTree(this.getColorThreshold()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanelSumoSearchPanelColoringRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanelSumoSearchPanelColoringRule.Jsii$Proxy that = (DashboardPanelSumoSearchPanelColoringRule.Jsii$Proxy) o;

            if (!multipleSeriesAggregateFunction.equals(that.multipleSeriesAggregateFunction)) return false;
            if (!scope.equals(that.scope)) return false;
            if (!singleSeriesAggregateFunction.equals(that.singleSeriesAggregateFunction)) return false;
            return this.colorThreshold != null ? this.colorThreshold.equals(that.colorThreshold) : that.colorThreshold == null;
        }

        @Override
        public final int hashCode() {
            int result = this.multipleSeriesAggregateFunction.hashCode();
            result = 31 * result + (this.scope.hashCode());
            result = 31 * result + (this.singleSeriesAggregateFunction.hashCode());
            result = 31 * result + (this.colorThreshold != null ? this.colorThreshold.hashCode() : 0);
            return result;
        }
    }
}
