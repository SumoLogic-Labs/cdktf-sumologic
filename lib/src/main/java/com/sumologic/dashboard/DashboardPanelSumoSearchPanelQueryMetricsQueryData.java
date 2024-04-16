package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.842Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData")
@software.amazon.jsii.Jsii.Proxy(DashboardPanelSumoSearchPanelQueryMetricsQueryData.Jsii$Proxy.class)
public interface DashboardPanelSumoSearchPanelQueryMetricsQueryData extends software.amazon.jsii.JsiiSerializable {

    /**
     * filter block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#filter Dashboard#filter}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getFilter();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#metric Dashboard#metric}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMetric();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#aggregation_type Dashboard#aggregation_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAggregationType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#group_by Dashboard#group_by}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroupBy() {
        return null;
    }

    /**
     * operator block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#operator Dashboard#operator}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOperator() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanelSumoSearchPanelQueryMetricsQueryData> {
        java.lang.Object filter;
        java.lang.String metric;
        java.lang.String aggregationType;
        java.lang.String groupBy;
        java.lang.Object operator;

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData#getFilter}
         * @param filter filter block. This parameter is required.
         *               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#filter Dashboard#filter}
         * @return {@code this}
         */
        public Builder filter(com.hashicorp.cdktf.IResolvable filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData#getFilter}
         * @param filter filter block. This parameter is required.
         *               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#filter Dashboard#filter}
         * @return {@code this}
         */
        public Builder filter(java.util.List<? extends com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData#getMetric}
         * @param metric Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#metric Dashboard#metric}. This parameter is required.
         * @return {@code this}
         */
        public Builder metric(java.lang.String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData#getAggregationType}
         * @param aggregationType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#aggregation_type Dashboard#aggregation_type}.
         * @return {@code this}
         */
        public Builder aggregationType(java.lang.String aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData#getGroupBy}
         * @param groupBy Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#group_by Dashboard#group_by}.
         * @return {@code this}
         */
        public Builder groupBy(java.lang.String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData#getOperator}
         * @param operator operator block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#operator Dashboard#operator}
         * @return {@code this}
         */
        public Builder operator(com.hashicorp.cdktf.IResolvable operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData#getOperator}
         * @param operator operator block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#operator Dashboard#operator}
         * @return {@code this}
         */
        public Builder operator(java.util.List<? extends com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryDataOperator> operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanelSumoSearchPanelQueryMetricsQueryData build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanelSumoSearchPanelQueryMetricsQueryData}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanelSumoSearchPanelQueryMetricsQueryData {
        private final java.lang.Object filter;
        private final java.lang.String metric;
        private final java.lang.String aggregationType;
        private final java.lang.String groupBy;
        private final java.lang.Object operator;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.metric = software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.aggregationType = software.amazon.jsii.Kernel.get(this, "aggregationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.groupBy = software.amazon.jsii.Kernel.get(this, "groupBy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operator = software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.filter = java.util.Objects.requireNonNull(builder.filter, "filter is required");
            this.metric = java.util.Objects.requireNonNull(builder.metric, "metric is required");
            this.aggregationType = builder.aggregationType;
            this.groupBy = builder.groupBy;
            this.operator = builder.operator;
        }

        @Override
        public final java.lang.Object getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getMetric() {
            return this.metric;
        }

        @Override
        public final java.lang.String getAggregationType() {
            return this.aggregationType;
        }

        @Override
        public final java.lang.String getGroupBy() {
            return this.groupBy;
        }

        @Override
        public final java.lang.Object getOperator() {
            return this.operator;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("filter", om.valueToTree(this.getFilter()));
            data.set("metric", om.valueToTree(this.getMetric()));
            if (this.getAggregationType() != null) {
                data.set("aggregationType", om.valueToTree(this.getAggregationType()));
            }
            if (this.getGroupBy() != null) {
                data.set("groupBy", om.valueToTree(this.getGroupBy()));
            }
            if (this.getOperator() != null) {
                data.set("operator", om.valueToTree(this.getOperator()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanelSumoSearchPanelQueryMetricsQueryData.Jsii$Proxy that = (DashboardPanelSumoSearchPanelQueryMetricsQueryData.Jsii$Proxy) o;

            if (!filter.equals(that.filter)) return false;
            if (!metric.equals(that.metric)) return false;
            if (this.aggregationType != null ? !this.aggregationType.equals(that.aggregationType) : that.aggregationType != null) return false;
            if (this.groupBy != null ? !this.groupBy.equals(that.groupBy) : that.groupBy != null) return false;
            return this.operator != null ? this.operator.equals(that.operator) : that.operator == null;
        }

        @Override
        public final int hashCode() {
            int result = this.filter.hashCode();
            result = 31 * result + (this.metric.hashCode());
            result = 31 * result + (this.aggregationType != null ? this.aggregationType.hashCode() : 0);
            result = 31 * result + (this.groupBy != null ? this.groupBy.hashCode() : 0);
            result = 31 * result + (this.operator != null ? this.operator.hashCode() : 0);
            return result;
        }
    }
}
