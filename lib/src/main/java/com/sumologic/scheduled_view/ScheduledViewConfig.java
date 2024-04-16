package com.sumologic.scheduled_view;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.205Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.scheduledView.ScheduledViewConfig")
@software.amazon.jsii.Jsii.Proxy(ScheduledViewConfig.Jsii$Proxy.class)
public interface ScheduledViewConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#index_name ScheduledView#index_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIndexName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#query ScheduledView#query}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getQuery();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#start_time ScheduledView#start_time}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStartTime();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#data_forwarding_id ScheduledView#data_forwarding_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDataForwardingId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#id ScheduledView#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#parsing_mode ScheduledView#parsing_mode}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getParsingMode() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#reduce_retention_period_immediately ScheduledView#reduce_retention_period_immediately}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReduceRetentionPeriodImmediately() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#retention_period ScheduledView#retention_period}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRetentionPeriod() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ScheduledViewConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ScheduledViewConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ScheduledViewConfig> {
        java.lang.String indexName;
        java.lang.String query;
        java.lang.String startTime;
        java.lang.String dataForwardingId;
        java.lang.String id;
        java.lang.String parsingMode;
        java.lang.Object reduceRetentionPeriodImmediately;
        java.lang.Number retentionPeriod;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link ScheduledViewConfig#getIndexName}
         * @param indexName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#index_name ScheduledView#index_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder indexName(java.lang.String indexName) {
            this.indexName = indexName;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getQuery}
         * @param query Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#query ScheduledView#query}. This parameter is required.
         * @return {@code this}
         */
        public Builder query(java.lang.String query) {
            this.query = query;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getStartTime}
         * @param startTime Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#start_time ScheduledView#start_time}. This parameter is required.
         * @return {@code this}
         */
        public Builder startTime(java.lang.String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getDataForwardingId}
         * @param dataForwardingId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#data_forwarding_id ScheduledView#data_forwarding_id}.
         * @return {@code this}
         */
        public Builder dataForwardingId(java.lang.String dataForwardingId) {
            this.dataForwardingId = dataForwardingId;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#id ScheduledView#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getParsingMode}
         * @param parsingMode Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#parsing_mode ScheduledView#parsing_mode}.
         * @return {@code this}
         */
        public Builder parsingMode(java.lang.String parsingMode) {
            this.parsingMode = parsingMode;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getReduceRetentionPeriodImmediately}
         * @param reduceRetentionPeriodImmediately Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#reduce_retention_period_immediately ScheduledView#reduce_retention_period_immediately}.
         * @return {@code this}
         */
        public Builder reduceRetentionPeriodImmediately(java.lang.Boolean reduceRetentionPeriodImmediately) {
            this.reduceRetentionPeriodImmediately = reduceRetentionPeriodImmediately;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getReduceRetentionPeriodImmediately}
         * @param reduceRetentionPeriodImmediately Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#reduce_retention_period_immediately ScheduledView#reduce_retention_period_immediately}.
         * @return {@code this}
         */
        public Builder reduceRetentionPeriodImmediately(com.hashicorp.cdktf.IResolvable reduceRetentionPeriodImmediately) {
            this.reduceRetentionPeriodImmediately = reduceRetentionPeriodImmediately;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getRetentionPeriod}
         * @param retentionPeriod Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/scheduled_view#retention_period ScheduledView#retention_period}.
         * @return {@code this}
         */
        public Builder retentionPeriod(java.lang.Number retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getDependsOn}
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
         * Sets the value of {@link ScheduledViewConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link ScheduledViewConfig#getProvisioners}
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
         * @return a new instance of {@link ScheduledViewConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ScheduledViewConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ScheduledViewConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ScheduledViewConfig {
        private final java.lang.String indexName;
        private final java.lang.String query;
        private final java.lang.String startTime;
        private final java.lang.String dataForwardingId;
        private final java.lang.String id;
        private final java.lang.String parsingMode;
        private final java.lang.Object reduceRetentionPeriodImmediately;
        private final java.lang.Number retentionPeriod;
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
            this.indexName = software.amazon.jsii.Kernel.get(this, "indexName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.query = software.amazon.jsii.Kernel.get(this, "query", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.startTime = software.amazon.jsii.Kernel.get(this, "startTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataForwardingId = software.amazon.jsii.Kernel.get(this, "dataForwardingId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parsingMode = software.amazon.jsii.Kernel.get(this, "parsingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reduceRetentionPeriodImmediately = software.amazon.jsii.Kernel.get(this, "reduceRetentionPeriodImmediately", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.retentionPeriod = software.amazon.jsii.Kernel.get(this, "retentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
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
            this.indexName = java.util.Objects.requireNonNull(builder.indexName, "indexName is required");
            this.query = java.util.Objects.requireNonNull(builder.query, "query is required");
            this.startTime = java.util.Objects.requireNonNull(builder.startTime, "startTime is required");
            this.dataForwardingId = builder.dataForwardingId;
            this.id = builder.id;
            this.parsingMode = builder.parsingMode;
            this.reduceRetentionPeriodImmediately = builder.reduceRetentionPeriodImmediately;
            this.retentionPeriod = builder.retentionPeriod;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getIndexName() {
            return this.indexName;
        }

        @Override
        public final java.lang.String getQuery() {
            return this.query;
        }

        @Override
        public final java.lang.String getStartTime() {
            return this.startTime;
        }

        @Override
        public final java.lang.String getDataForwardingId() {
            return this.dataForwardingId;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getParsingMode() {
            return this.parsingMode;
        }

        @Override
        public final java.lang.Object getReduceRetentionPeriodImmediately() {
            return this.reduceRetentionPeriodImmediately;
        }

        @Override
        public final java.lang.Number getRetentionPeriod() {
            return this.retentionPeriod;
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

            data.set("indexName", om.valueToTree(this.getIndexName()));
            data.set("query", om.valueToTree(this.getQuery()));
            data.set("startTime", om.valueToTree(this.getStartTime()));
            if (this.getDataForwardingId() != null) {
                data.set("dataForwardingId", om.valueToTree(this.getDataForwardingId()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getParsingMode() != null) {
                data.set("parsingMode", om.valueToTree(this.getParsingMode()));
            }
            if (this.getReduceRetentionPeriodImmediately() != null) {
                data.set("reduceRetentionPeriodImmediately", om.valueToTree(this.getReduceRetentionPeriodImmediately()));
            }
            if (this.getRetentionPeriod() != null) {
                data.set("retentionPeriod", om.valueToTree(this.getRetentionPeriod()));
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
            struct.set("fqn", om.valueToTree("sumologic.scheduledView.ScheduledViewConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ScheduledViewConfig.Jsii$Proxy that = (ScheduledViewConfig.Jsii$Proxy) o;

            if (!indexName.equals(that.indexName)) return false;
            if (!query.equals(that.query)) return false;
            if (!startTime.equals(that.startTime)) return false;
            if (this.dataForwardingId != null ? !this.dataForwardingId.equals(that.dataForwardingId) : that.dataForwardingId != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.parsingMode != null ? !this.parsingMode.equals(that.parsingMode) : that.parsingMode != null) return false;
            if (this.reduceRetentionPeriodImmediately != null ? !this.reduceRetentionPeriodImmediately.equals(that.reduceRetentionPeriodImmediately) : that.reduceRetentionPeriodImmediately != null) return false;
            if (this.retentionPeriod != null ? !this.retentionPeriod.equals(that.retentionPeriod) : that.retentionPeriod != null) return false;
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
            int result = this.indexName.hashCode();
            result = 31 * result + (this.query.hashCode());
            result = 31 * result + (this.startTime.hashCode());
            result = 31 * result + (this.dataForwardingId != null ? this.dataForwardingId.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.parsingMode != null ? this.parsingMode.hashCode() : 0);
            result = 31 * result + (this.reduceRetentionPeriodImmediately != null ? this.reduceRetentionPeriodImmediately.hashCode() : 0);
            result = 31 * result + (this.retentionPeriod != null ? this.retentionPeriod.hashCode() : 0);
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
