package com.sumologic.policies;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies sumologic_policies}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.141Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.policies.Policies")
public class Policies extends com.hashicorp.cdktf.TerraformResource {

    protected Policies(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Policies(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.policies.Policies.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies sumologic_policies} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Policies(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull com.sumologic.policies.PoliciesConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    /**
     * Generates CDKTF code for importing a Policies resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the Policies to import. This parameter is required.
     * @param importFromId The id of the existing Policies that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the Policies to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.policies.Policies.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a Policies resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the Policies to import. This parameter is required.
     * @param importFromId The id of the existing Policies that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.policies.Policies.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void putUserConcurrentSessionsLimit(final @org.jetbrains.annotations.NotNull com.sumologic.policies.PoliciesUserConcurrentSessionsLimit value) {
        software.amazon.jsii.Kernel.call(this, "putUserConcurrentSessionsLimit", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeHclAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeHclAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull com.sumologic.policies.PoliciesUserConcurrentSessionsLimitOutputReference getUserConcurrentSessionsLimit() {
        return software.amazon.jsii.Kernel.get(this, "userConcurrentSessionsLimit", software.amazon.jsii.NativeType.forClass(com.sumologic.policies.PoliciesUserConcurrentSessionsLimitOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAuditInput() {
        return software.amazon.jsii.Kernel.get(this, "auditInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDataAccessLevelInput() {
        return software.amazon.jsii.Kernel.get(this, "dataAccessLevelInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMaxUserSessionTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "maxUserSessionTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSearchAuditInput() {
        return software.amazon.jsii.Kernel.get(this, "searchAuditInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getShareDashboardsOutsideOrganizationInput() {
        return software.amazon.jsii.Kernel.get(this, "shareDashboardsOutsideOrganizationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.policies.PoliciesUserConcurrentSessionsLimit getUserConcurrentSessionsLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "userConcurrentSessionsLimitInput", software.amazon.jsii.NativeType.forClass(com.sumologic.policies.PoliciesUserConcurrentSessionsLimit.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAudit() {
        return software.amazon.jsii.Kernel.get(this, "audit", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAudit(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "audit", java.util.Objects.requireNonNull(value, "audit is required"));
    }

    public void setAudit(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "audit", java.util.Objects.requireNonNull(value, "audit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDataAccessLevel() {
        return software.amazon.jsii.Kernel.get(this, "dataAccessLevel", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDataAccessLevel(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "dataAccessLevel", java.util.Objects.requireNonNull(value, "dataAccessLevel is required"));
    }

    public void setDataAccessLevel(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "dataAccessLevel", java.util.Objects.requireNonNull(value, "dataAccessLevel is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxUserSessionTimeout() {
        return software.amazon.jsii.Kernel.get(this, "maxUserSessionTimeout", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxUserSessionTimeout(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxUserSessionTimeout", java.util.Objects.requireNonNull(value, "maxUserSessionTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSearchAudit() {
        return software.amazon.jsii.Kernel.get(this, "searchAudit", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSearchAudit(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "searchAudit", java.util.Objects.requireNonNull(value, "searchAudit is required"));
    }

    public void setSearchAudit(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "searchAudit", java.util.Objects.requireNonNull(value, "searchAudit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getShareDashboardsOutsideOrganization() {
        return software.amazon.jsii.Kernel.get(this, "shareDashboardsOutsideOrganization", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setShareDashboardsOutsideOrganization(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "shareDashboardsOutsideOrganization", java.util.Objects.requireNonNull(value, "shareDashboardsOutsideOrganization is required"));
    }

    public void setShareDashboardsOutsideOrganization(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "shareDashboardsOutsideOrganization", java.util.Objects.requireNonNull(value, "shareDashboardsOutsideOrganization is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.policies.Policies}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.policies.Policies> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final com.sumologic.policies.PoliciesConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new com.sumologic.policies.PoliciesConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }
        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final com.hashicorp.cdktf.TerraformCount count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#audit Policies#audit}.
         * <p>
         * @return {@code this}
         * @param audit Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#audit Policies#audit}. This parameter is required.
         */
        public Builder audit(final java.lang.Boolean audit) {
            this.config.audit(audit);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#audit Policies#audit}.
         * <p>
         * @return {@code this}
         * @param audit Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#audit Policies#audit}. This parameter is required.
         */
        public Builder audit(final com.hashicorp.cdktf.IResolvable audit) {
            this.config.audit(audit);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#data_access_level Policies#data_access_level}.
         * <p>
         * @return {@code this}
         * @param dataAccessLevel Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#data_access_level Policies#data_access_level}. This parameter is required.
         */
        public Builder dataAccessLevel(final java.lang.Boolean dataAccessLevel) {
            this.config.dataAccessLevel(dataAccessLevel);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#data_access_level Policies#data_access_level}.
         * <p>
         * @return {@code this}
         * @param dataAccessLevel Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#data_access_level Policies#data_access_level}. This parameter is required.
         */
        public Builder dataAccessLevel(final com.hashicorp.cdktf.IResolvable dataAccessLevel) {
            this.config.dataAccessLevel(dataAccessLevel);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#max_user_session_timeout Policies#max_user_session_timeout}.
         * <p>
         * @return {@code this}
         * @param maxUserSessionTimeout Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#max_user_session_timeout Policies#max_user_session_timeout}. This parameter is required.
         */
        public Builder maxUserSessionTimeout(final java.lang.String maxUserSessionTimeout) {
            this.config.maxUserSessionTimeout(maxUserSessionTimeout);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#search_audit Policies#search_audit}.
         * <p>
         * @return {@code this}
         * @param searchAudit Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#search_audit Policies#search_audit}. This parameter is required.
         */
        public Builder searchAudit(final java.lang.Boolean searchAudit) {
            this.config.searchAudit(searchAudit);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#search_audit Policies#search_audit}.
         * <p>
         * @return {@code this}
         * @param searchAudit Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#search_audit Policies#search_audit}. This parameter is required.
         */
        public Builder searchAudit(final com.hashicorp.cdktf.IResolvable searchAudit) {
            this.config.searchAudit(searchAudit);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#share_dashboards_outside_organization Policies#share_dashboards_outside_organization}.
         * <p>
         * @return {@code this}
         * @param shareDashboardsOutsideOrganization Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#share_dashboards_outside_organization Policies#share_dashboards_outside_organization}. This parameter is required.
         */
        public Builder shareDashboardsOutsideOrganization(final java.lang.Boolean shareDashboardsOutsideOrganization) {
            this.config.shareDashboardsOutsideOrganization(shareDashboardsOutsideOrganization);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#share_dashboards_outside_organization Policies#share_dashboards_outside_organization}.
         * <p>
         * @return {@code this}
         * @param shareDashboardsOutsideOrganization Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#share_dashboards_outside_organization Policies#share_dashboards_outside_organization}. This parameter is required.
         */
        public Builder shareDashboardsOutsideOrganization(final com.hashicorp.cdktf.IResolvable shareDashboardsOutsideOrganization) {
            this.config.shareDashboardsOutsideOrganization(shareDashboardsOutsideOrganization);
            return this;
        }

        /**
         * user_concurrent_sessions_limit block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#user_concurrent_sessions_limit Policies#user_concurrent_sessions_limit}
         * <p>
         * @return {@code this}
         * @param userConcurrentSessionsLimit user_concurrent_sessions_limit block. This parameter is required.
         */
        public Builder userConcurrentSessionsLimit(final com.sumologic.policies.PoliciesUserConcurrentSessionsLimit userConcurrentSessionsLimit) {
            this.config.userConcurrentSessionsLimit(userConcurrentSessionsLimit);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#id Policies#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/policies#id Policies#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.policies.Policies}.
         */
        @Override
        public com.sumologic.policies.Policies build() {
            return new com.sumologic.policies.Policies(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
