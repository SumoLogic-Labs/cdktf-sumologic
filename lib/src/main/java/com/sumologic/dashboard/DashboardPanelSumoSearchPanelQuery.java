package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.840Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelQuery")
@software.amazon.jsii.Jsii.Proxy(DashboardPanelSumoSearchPanelQuery.Jsii$Proxy.class)
public interface DashboardPanelSumoSearchPanelQuery extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query_key Dashboard#query_key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getQueryKey();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query_string Dashboard#query_string}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getQueryString();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query_type Dashboard#query_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getQueryType();

    /**
     * metrics_query_data block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#metrics_query_data Dashboard#metrics_query_data}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData getMetricsQueryData() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#metrics_query_mode Dashboard#metrics_query_mode}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMetricsQueryMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardPanelSumoSearchPanelQuery}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanelSumoSearchPanelQuery}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanelSumoSearchPanelQuery> {
        java.lang.String queryKey;
        java.lang.String queryString;
        java.lang.String queryType;
        com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData metricsQueryData;
        java.lang.String metricsQueryMode;

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQuery#getQueryKey}
         * @param queryKey Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query_key Dashboard#query_key}. This parameter is required.
         * @return {@code this}
         */
        public Builder queryKey(java.lang.String queryKey) {
            this.queryKey = queryKey;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQuery#getQueryString}
         * @param queryString Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query_string Dashboard#query_string}. This parameter is required.
         * @return {@code this}
         */
        public Builder queryString(java.lang.String queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQuery#getQueryType}
         * @param queryType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query_type Dashboard#query_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder queryType(java.lang.String queryType) {
            this.queryType = queryType;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQuery#getMetricsQueryData}
         * @param metricsQueryData metrics_query_data block.
         *                         Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#metrics_query_data Dashboard#metrics_query_data}
         * @return {@code this}
         */
        public Builder metricsQueryData(com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData metricsQueryData) {
            this.metricsQueryData = metricsQueryData;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQuery#getMetricsQueryMode}
         * @param metricsQueryMode Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#metrics_query_mode Dashboard#metrics_query_mode}.
         * @return {@code this}
         */
        public Builder metricsQueryMode(java.lang.String metricsQueryMode) {
            this.metricsQueryMode = metricsQueryMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanelSumoSearchPanelQuery}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanelSumoSearchPanelQuery build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanelSumoSearchPanelQuery}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanelSumoSearchPanelQuery {
        private final java.lang.String queryKey;
        private final java.lang.String queryString;
        private final java.lang.String queryType;
        private final com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData metricsQueryData;
        private final java.lang.String metricsQueryMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.queryKey = software.amazon.jsii.Kernel.get(this, "queryKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.queryString = software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.queryType = software.amazon.jsii.Kernel.get(this, "queryType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricsQueryData = software.amazon.jsii.Kernel.get(this, "metricsQueryData", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData.class));
            this.metricsQueryMode = software.amazon.jsii.Kernel.get(this, "metricsQueryMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.queryKey = java.util.Objects.requireNonNull(builder.queryKey, "queryKey is required");
            this.queryString = java.util.Objects.requireNonNull(builder.queryString, "queryString is required");
            this.queryType = java.util.Objects.requireNonNull(builder.queryType, "queryType is required");
            this.metricsQueryData = builder.metricsQueryData;
            this.metricsQueryMode = builder.metricsQueryMode;
        }

        @Override
        public final java.lang.String getQueryKey() {
            return this.queryKey;
        }

        @Override
        public final java.lang.String getQueryString() {
            return this.queryString;
        }

        @Override
        public final java.lang.String getQueryType() {
            return this.queryType;
        }

        @Override
        public final com.sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryData getMetricsQueryData() {
            return this.metricsQueryData;
        }

        @Override
        public final java.lang.String getMetricsQueryMode() {
            return this.metricsQueryMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("queryKey", om.valueToTree(this.getQueryKey()));
            data.set("queryString", om.valueToTree(this.getQueryString()));
            data.set("queryType", om.valueToTree(this.getQueryType()));
            if (this.getMetricsQueryData() != null) {
                data.set("metricsQueryData", om.valueToTree(this.getMetricsQueryData()));
            }
            if (this.getMetricsQueryMode() != null) {
                data.set("metricsQueryMode", om.valueToTree(this.getMetricsQueryMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanelSumoSearchPanelQuery"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanelSumoSearchPanelQuery.Jsii$Proxy that = (DashboardPanelSumoSearchPanelQuery.Jsii$Proxy) o;

            if (!queryKey.equals(that.queryKey)) return false;
            if (!queryString.equals(that.queryString)) return false;
            if (!queryType.equals(that.queryType)) return false;
            if (this.metricsQueryData != null ? !this.metricsQueryData.equals(that.metricsQueryData) : that.metricsQueryData != null) return false;
            return this.metricsQueryMode != null ? this.metricsQueryMode.equals(that.metricsQueryMode) : that.metricsQueryMode == null;
        }

        @Override
        public final int hashCode() {
            int result = this.queryKey.hashCode();
            result = 31 * result + (this.queryString.hashCode());
            result = 31 * result + (this.queryType.hashCode());
            result = 31 * result + (this.metricsQueryData != null ? this.metricsQueryData.hashCode() : 0);
            result = 31 * result + (this.metricsQueryMode != null ? this.metricsQueryMode.hashCode() : 0);
            return result;
        }
    }
}
