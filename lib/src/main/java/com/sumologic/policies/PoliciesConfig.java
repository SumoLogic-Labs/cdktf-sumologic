package com.sumologic.policies;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.142Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.policies.PoliciesConfig")
@software.amazon.jsii.Jsii.Proxy(PoliciesConfig.Jsii$Proxy.class)
public interface PoliciesConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#audit Policies#audit}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getAudit();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#data_access_level Policies#data_access_level}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getDataAccessLevel();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#max_user_session_timeout Policies#max_user_session_timeout}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMaxUserSessionTimeout();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#search_audit Policies#search_audit}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getSearchAudit();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#share_dashboards_outside_organization Policies#share_dashboards_outside_organization}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getShareDashboardsOutsideOrganization();

    /**
     * user_concurrent_sessions_limit block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#user_concurrent_sessions_limit Policies#user_concurrent_sessions_limit}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.policies.PoliciesUserConcurrentSessionsLimit getUserConcurrentSessionsLimit();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#id Policies#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PoliciesConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PoliciesConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PoliciesConfig> {
        java.lang.Object audit;
        java.lang.Object dataAccessLevel;
        java.lang.String maxUserSessionTimeout;
        java.lang.Object searchAudit;
        java.lang.Object shareDashboardsOutsideOrganization;
        com.sumologic.policies.PoliciesUserConcurrentSessionsLimit userConcurrentSessionsLimit;
        java.lang.String id;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link PoliciesConfig#getAudit}
         * @param audit Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#audit Policies#audit}. This parameter is required.
         * @return {@code this}
         */
        public Builder audit(java.lang.Boolean audit) {
            this.audit = audit;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getAudit}
         * @param audit Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#audit Policies#audit}. This parameter is required.
         * @return {@code this}
         */
        public Builder audit(com.hashicorp.cdktf.IResolvable audit) {
            this.audit = audit;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getDataAccessLevel}
         * @param dataAccessLevel Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#data_access_level Policies#data_access_level}. This parameter is required.
         * @return {@code this}
         */
        public Builder dataAccessLevel(java.lang.Boolean dataAccessLevel) {
            this.dataAccessLevel = dataAccessLevel;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getDataAccessLevel}
         * @param dataAccessLevel Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#data_access_level Policies#data_access_level}. This parameter is required.
         * @return {@code this}
         */
        public Builder dataAccessLevel(com.hashicorp.cdktf.IResolvable dataAccessLevel) {
            this.dataAccessLevel = dataAccessLevel;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getMaxUserSessionTimeout}
         * @param maxUserSessionTimeout Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#max_user_session_timeout Policies#max_user_session_timeout}. This parameter is required.
         * @return {@code this}
         */
        public Builder maxUserSessionTimeout(java.lang.String maxUserSessionTimeout) {
            this.maxUserSessionTimeout = maxUserSessionTimeout;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getSearchAudit}
         * @param searchAudit Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#search_audit Policies#search_audit}. This parameter is required.
         * @return {@code this}
         */
        public Builder searchAudit(java.lang.Boolean searchAudit) {
            this.searchAudit = searchAudit;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getSearchAudit}
         * @param searchAudit Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#search_audit Policies#search_audit}. This parameter is required.
         * @return {@code this}
         */
        public Builder searchAudit(com.hashicorp.cdktf.IResolvable searchAudit) {
            this.searchAudit = searchAudit;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getShareDashboardsOutsideOrganization}
         * @param shareDashboardsOutsideOrganization Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#share_dashboards_outside_organization Policies#share_dashboards_outside_organization}. This parameter is required.
         * @return {@code this}
         */
        public Builder shareDashboardsOutsideOrganization(java.lang.Boolean shareDashboardsOutsideOrganization) {
            this.shareDashboardsOutsideOrganization = shareDashboardsOutsideOrganization;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getShareDashboardsOutsideOrganization}
         * @param shareDashboardsOutsideOrganization Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#share_dashboards_outside_organization Policies#share_dashboards_outside_organization}. This parameter is required.
         * @return {@code this}
         */
        public Builder shareDashboardsOutsideOrganization(com.hashicorp.cdktf.IResolvable shareDashboardsOutsideOrganization) {
            this.shareDashboardsOutsideOrganization = shareDashboardsOutsideOrganization;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getUserConcurrentSessionsLimit}
         * @param userConcurrentSessionsLimit user_concurrent_sessions_limit block. This parameter is required.
         *                                    Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#user_concurrent_sessions_limit Policies#user_concurrent_sessions_limit}
         * @return {@code this}
         */
        public Builder userConcurrentSessionsLimit(com.sumologic.policies.PoliciesUserConcurrentSessionsLimit userConcurrentSessionsLimit) {
            this.userConcurrentSessionsLimit = userConcurrentSessionsLimit;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#id Policies#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getDependsOn}
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
         * Sets the value of {@link PoliciesConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link PoliciesConfig#getProvisioners}
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
         * @return a new instance of {@link PoliciesConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PoliciesConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PoliciesConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PoliciesConfig {
        private final java.lang.Object audit;
        private final java.lang.Object dataAccessLevel;
        private final java.lang.String maxUserSessionTimeout;
        private final java.lang.Object searchAudit;
        private final java.lang.Object shareDashboardsOutsideOrganization;
        private final com.sumologic.policies.PoliciesUserConcurrentSessionsLimit userConcurrentSessionsLimit;
        private final java.lang.String id;
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
            this.audit = software.amazon.jsii.Kernel.get(this, "audit", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dataAccessLevel = software.amazon.jsii.Kernel.get(this, "dataAccessLevel", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.maxUserSessionTimeout = software.amazon.jsii.Kernel.get(this, "maxUserSessionTimeout", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.searchAudit = software.amazon.jsii.Kernel.get(this, "searchAudit", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.shareDashboardsOutsideOrganization = software.amazon.jsii.Kernel.get(this, "shareDashboardsOutsideOrganization", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.userConcurrentSessionsLimit = software.amazon.jsii.Kernel.get(this, "userConcurrentSessionsLimit", software.amazon.jsii.NativeType.forClass(com.sumologic.policies.PoliciesUserConcurrentSessionsLimit.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.audit = java.util.Objects.requireNonNull(builder.audit, "audit is required");
            this.dataAccessLevel = java.util.Objects.requireNonNull(builder.dataAccessLevel, "dataAccessLevel is required");
            this.maxUserSessionTimeout = java.util.Objects.requireNonNull(builder.maxUserSessionTimeout, "maxUserSessionTimeout is required");
            this.searchAudit = java.util.Objects.requireNonNull(builder.searchAudit, "searchAudit is required");
            this.shareDashboardsOutsideOrganization = java.util.Objects.requireNonNull(builder.shareDashboardsOutsideOrganization, "shareDashboardsOutsideOrganization is required");
            this.userConcurrentSessionsLimit = java.util.Objects.requireNonNull(builder.userConcurrentSessionsLimit, "userConcurrentSessionsLimit is required");
            this.id = builder.id;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.Object getAudit() {
            return this.audit;
        }

        @Override
        public final java.lang.Object getDataAccessLevel() {
            return this.dataAccessLevel;
        }

        @Override
        public final java.lang.String getMaxUserSessionTimeout() {
            return this.maxUserSessionTimeout;
        }

        @Override
        public final java.lang.Object getSearchAudit() {
            return this.searchAudit;
        }

        @Override
        public final java.lang.Object getShareDashboardsOutsideOrganization() {
            return this.shareDashboardsOutsideOrganization;
        }

        @Override
        public final com.sumologic.policies.PoliciesUserConcurrentSessionsLimit getUserConcurrentSessionsLimit() {
            return this.userConcurrentSessionsLimit;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
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

            data.set("audit", om.valueToTree(this.getAudit()));
            data.set("dataAccessLevel", om.valueToTree(this.getDataAccessLevel()));
            data.set("maxUserSessionTimeout", om.valueToTree(this.getMaxUserSessionTimeout()));
            data.set("searchAudit", om.valueToTree(this.getSearchAudit()));
            data.set("shareDashboardsOutsideOrganization", om.valueToTree(this.getShareDashboardsOutsideOrganization()));
            data.set("userConcurrentSessionsLimit", om.valueToTree(this.getUserConcurrentSessionsLimit()));
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
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
            struct.set("fqn", om.valueToTree("sumologic.policies.PoliciesConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PoliciesConfig.Jsii$Proxy that = (PoliciesConfig.Jsii$Proxy) o;

            if (!audit.equals(that.audit)) return false;
            if (!dataAccessLevel.equals(that.dataAccessLevel)) return false;
            if (!maxUserSessionTimeout.equals(that.maxUserSessionTimeout)) return false;
            if (!searchAudit.equals(that.searchAudit)) return false;
            if (!shareDashboardsOutsideOrganization.equals(that.shareDashboardsOutsideOrganization)) return false;
            if (!userConcurrentSessionsLimit.equals(that.userConcurrentSessionsLimit)) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
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
            int result = this.audit.hashCode();
            result = 31 * result + (this.dataAccessLevel.hashCode());
            result = 31 * result + (this.maxUserSessionTimeout.hashCode());
            result = 31 * result + (this.searchAudit.hashCode());
            result = 31 * result + (this.shareDashboardsOutsideOrganization.hashCode());
            result = 31 * result + (this.userConcurrentSessionsLimit.hashCode());
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
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
