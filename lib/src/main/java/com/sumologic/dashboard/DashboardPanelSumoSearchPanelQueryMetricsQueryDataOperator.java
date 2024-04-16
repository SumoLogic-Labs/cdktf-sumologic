package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.848Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator")
@software.amazon.jsii.Jsii.Proxy(DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator.Jsii$Proxy.class)
public interface DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#operator_name Dashboard#operator_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOperatorName();

    /**
     * parameter block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#parameter Dashboard#parameter}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getParameter();

    /**
     * @return a {@link Builder} of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator> {
        java.lang.String operatorName;
        java.lang.Object parameter;

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator#getOperatorName}
         * @param operatorName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#operator_name Dashboard#operator_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder operatorName(java.lang.String operatorName) {
            this.operatorName = operatorName;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator#getParameter}
         * @param parameter parameter block. This parameter is required.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#parameter Dashboard#parameter}
         * @return {@code this}
         */
        public Builder parameter(com.hashicorp.cdktf.IResolvable parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator#getParameter}
         * @param parameter parameter block. This parameter is required.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#parameter Dashboard#parameter}
         * @return {@code this}
         */
        public Builder parameter(java.util.List<? extends com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperatorParameter> parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator {
        private final java.lang.String operatorName;
        private final java.lang.Object parameter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.operatorName = software.amazon.jsii.Kernel.get(this, "operatorName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameter = software.amazon.jsii.Kernel.get(this, "parameter", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.operatorName = java.util.Objects.requireNonNull(builder.operatorName, "operatorName is required");
            this.parameter = java.util.Objects.requireNonNull(builder.parameter, "parameter is required");
        }

        @Override
        public final java.lang.String getOperatorName() {
            return this.operatorName;
        }

        @Override
        public final java.lang.Object getParameter() {
            return this.parameter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("operatorName", om.valueToTree(this.getOperatorName()));
            data.set("parameter", om.valueToTree(this.getParameter()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator.Jsii$Proxy that = (DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator.Jsii$Proxy) o;

            if (!operatorName.equals(that.operatorName)) return false;
            return this.parameter.equals(that.parameter);
        }

        @Override
        public final int hashCode() {
            int result = this.operatorName.hashCode();
            result = 31 * result + (this.parameter.hashCode());
            return result;
        }
    }
}
