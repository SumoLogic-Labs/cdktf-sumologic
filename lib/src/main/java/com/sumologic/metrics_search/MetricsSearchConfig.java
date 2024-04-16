package com.sumologic.metrics_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.100Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metricsSearch.MetricsSearchConfig")
@software.amazon.jsii.Jsii.Proxy(MetricsSearchConfig.Jsii$Proxy.class)
public interface MetricsSearchConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#description MetricsSearch#description}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDescription();

    /**
     * metrics_queries block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#metrics_queries MetricsSearch#metrics_queries}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getMetricsQueries();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#parent_id MetricsSearch#parent_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getParentId();

    /**
     * time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#time_range MetricsSearch#time_range}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.metrics_search.MetricsSearchTimeRange getTimeRange();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#title MetricsSearch#title}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTitle();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#desired_quantization_in_secs MetricsSearch#desired_quantization_in_secs}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDesiredQuantizationInSecs() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#id MetricsSearch#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#log_query MetricsSearch#log_query}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLogQuery() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MetricsSearchConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetricsSearchConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetricsSearchConfig> {
        java.lang.String description;
        java.lang.Object metricsQueries;
        java.lang.String parentId;
        com.sumologic.metrics_search.MetricsSearchTimeRange timeRange;
        java.lang.String title;
        java.lang.Number desiredQuantizationInSecs;
        java.lang.String id;
        java.lang.String logQuery;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link MetricsSearchConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#description MetricsSearch#description}. This parameter is required.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getMetricsQueries}
         * @param metricsQueries metrics_queries block. This parameter is required.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#metrics_queries MetricsSearch#metrics_queries}
         * @return {@code this}
         */
        public Builder metricsQueries(com.hashicorp.cdktf.IResolvable metricsQueries) {
            this.metricsQueries = metricsQueries;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getMetricsQueries}
         * @param metricsQueries metrics_queries block. This parameter is required.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#metrics_queries MetricsSearch#metrics_queries}
         * @return {@code this}
         */
        public Builder metricsQueries(java.util.List<? extends com.sumologic.metrics_search.MetricsSearchMetricsQueries> metricsQueries) {
            this.metricsQueries = metricsQueries;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getParentId}
         * @param parentId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#parent_id MetricsSearch#parent_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder parentId(java.lang.String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getTimeRange}
         * @param timeRange time_range block. This parameter is required.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#time_range MetricsSearch#time_range}
         * @return {@code this}
         */
        public Builder timeRange(com.sumologic.metrics_search.MetricsSearchTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getTitle}
         * @param title Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#title MetricsSearch#title}. This parameter is required.
         * @return {@code this}
         */
        public Builder title(java.lang.String title) {
            this.title = title;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getDesiredQuantizationInSecs}
         * @param desiredQuantizationInSecs Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#desired_quantization_in_secs MetricsSearch#desired_quantization_in_secs}.
         * @return {@code this}
         */
        public Builder desiredQuantizationInSecs(java.lang.Number desiredQuantizationInSecs) {
            this.desiredQuantizationInSecs = desiredQuantizationInSecs;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#id MetricsSearch#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getLogQuery}
         * @param logQuery Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metrics_search#log_query MetricsSearch#log_query}.
         * @return {@code this}
         */
        public Builder logQuery(java.lang.String logQuery) {
            this.logQuery = logQuery;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link MetricsSearchConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetricsSearchConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetricsSearchConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetricsSearchConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetricsSearchConfig {
        private final java.lang.String description;
        private final java.lang.Object metricsQueries;
        private final java.lang.String parentId;
        private final com.sumologic.metrics_search.MetricsSearchTimeRange timeRange;
        private final java.lang.String title;
        private final java.lang.Number desiredQuantizationInSecs;
        private final java.lang.String id;
        private final java.lang.String logQuery;
        private final java.lang.Object connection;
        private final java.lang.Object count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricsQueries = software.amazon.jsii.Kernel.get(this, "metricsQueries", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.parentId = software.amazon.jsii.Kernel.get(this, "parentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.metrics_search.MetricsSearchTimeRange.class));
            this.title = software.amazon.jsii.Kernel.get(this, "title", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.desiredQuantizationInSecs = software.amazon.jsii.Kernel.get(this, "desiredQuantizationInSecs", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logQuery = software.amazon.jsii.Kernel.get(this, "logQuery", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.description = java.util.Objects.requireNonNull(builder.description, "description is required");
            this.metricsQueries = java.util.Objects.requireNonNull(builder.metricsQueries, "metricsQueries is required");
            this.parentId = java.util.Objects.requireNonNull(builder.parentId, "parentId is required");
            this.timeRange = java.util.Objects.requireNonNull(builder.timeRange, "timeRange is required");
            this.title = java.util.Objects.requireNonNull(builder.title, "title is required");
            this.desiredQuantizationInSecs = builder.desiredQuantizationInSecs;
            this.id = builder.id;
            this.logQuery = builder.logQuery;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Object getMetricsQueries() {
            return this.metricsQueries;
        }

        @Override
        public final java.lang.String getParentId() {
            return this.parentId;
        }

        @Override
        public final com.sumologic.metrics_search.MetricsSearchTimeRange getTimeRange() {
            return this.timeRange;
        }

        @Override
        public final java.lang.String getTitle() {
            return this.title;
        }

        @Override
        public final java.lang.Number getDesiredQuantizationInSecs() {
            return this.desiredQuantizationInSecs;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getLogQuery() {
            return this.logQuery;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Object getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("description", om.valueToTree(this.getDescription()));
            data.set("metricsQueries", om.valueToTree(this.getMetricsQueries()));
            data.set("parentId", om.valueToTree(this.getParentId()));
            data.set("timeRange", om.valueToTree(this.getTimeRange()));
            data.set("title", om.valueToTree(this.getTitle()));
            if (this.getDesiredQuantizationInSecs() != null) {
                data.set("desiredQuantizationInSecs", om.valueToTree(this.getDesiredQuantizationInSecs()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getLogQuery() != null) {
                data.set("logQuery", om.valueToTree(this.getLogQuery()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.metricsSearch.MetricsSearchConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetricsSearchConfig.Jsii$Proxy that = (MetricsSearchConfig.Jsii$Proxy) o;

            if (!description.equals(that.description)) return false;
            if (!metricsQueries.equals(that.metricsQueries)) return false;
            if (!parentId.equals(that.parentId)) return false;
            if (!timeRange.equals(that.timeRange)) return false;
            if (!title.equals(that.title)) return false;
            if (this.desiredQuantizationInSecs != null ? !this.desiredQuantizationInSecs.equals(that.desiredQuantizationInSecs) : that.desiredQuantizationInSecs != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.logQuery != null ? !this.logQuery.equals(that.logQuery) : that.logQuery != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.description.hashCode();
            result = 31 * result + (this.metricsQueries.hashCode());
            result = 31 * result + (this.parentId.hashCode());
            result = 31 * result + (this.timeRange.hashCode());
            result = 31 * result + (this.title.hashCode());
            result = 31 * result + (this.desiredQuantizationInSecs != null ? this.desiredQuantizationInSecs.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.logQuery != null ? this.logQuery.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
