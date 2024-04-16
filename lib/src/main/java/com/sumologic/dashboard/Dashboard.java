package com.sumologic.dashboard;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard sumologic_dashboard}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.796Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.Dashboard")
public class Dashboard extends com.hashicorp.cdktf.TerraformResource {

    protected Dashboard(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Dashboard(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.dashboard.Dashboard.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard sumologic_dashboard} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Dashboard(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    /**
     * Generates CDKTF code for importing a Dashboard resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the Dashboard to import. This parameter is required.
     * @param importFromId The id of the existing Dashboard that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the Dashboard to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.dashboard.Dashboard.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a Dashboard resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the Dashboard to import. This parameter is required.
     * @param importFromId The id of the existing Dashboard that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.dashboard.Dashboard.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void putColoringRule(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.dashboard.DashboardColoringRule>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.dashboard.DashboardColoringRule> __cast_cd4240 = (java.util.List<com.sumologic.dashboard.DashboardColoringRule>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.dashboard.DashboardColoringRule __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putColoringRule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLayout(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardLayout value) {
        software.amazon.jsii.Kernel.call(this, "putLayout", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPanel(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.dashboard.DashboardPanel>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.dashboard.DashboardPanel> __cast_cd4240 = (java.util.List<com.sumologic.dashboard.DashboardPanel>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.dashboard.DashboardPanel __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putPanel", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTopologyLabelMap(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTopologyLabelMap value) {
        software.amazon.jsii.Kernel.call(this, "putTopologyLabelMap", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVariable(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.dashboard.DashboardVariable>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.dashboard.DashboardVariable> __cast_cd4240 = (java.util.List<com.sumologic.dashboard.DashboardVariable>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.dashboard.DashboardVariable __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putVariable", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetColoringRule() {
        software.amazon.jsii.Kernel.call(this, "resetColoringRule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDomain() {
        software.amazon.jsii.Kernel.call(this, "resetDomain", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFolderId() {
        software.amazon.jsii.Kernel.call(this, "resetFolderId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLayout() {
        software.amazon.jsii.Kernel.call(this, "resetLayout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPanel() {
        software.amazon.jsii.Kernel.call(this, "resetPanel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRefreshInterval() {
        software.amazon.jsii.Kernel.call(this, "resetRefreshInterval", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTheme() {
        software.amazon.jsii.Kernel.call(this, "resetTheme", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTopologyLabelMap() {
        software.amazon.jsii.Kernel.call(this, "resetTopologyLabelMap", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVariable() {
        software.amazon.jsii.Kernel.call(this, "resetVariable", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardColoringRuleList getColoringRule() {
        return software.amazon.jsii.Kernel.get(this, "coloringRule", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardColoringRuleList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardLayoutOutputReference getLayout() {
        return software.amazon.jsii.Kernel.get(this, "layout", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardLayoutOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelList getPanel() {
        return software.amazon.jsii.Kernel.get(this, "panel", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRangeOutputReference getTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTopologyLabelMapOutputReference getTopologyLabelMap() {
        return software.amazon.jsii.Kernel.get(this, "topologyLabelMap", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTopologyLabelMapOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableList getVariable() {
        return software.amazon.jsii.Kernel.get(this, "variable", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getColoringRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "coloringRuleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDomainInput() {
        return software.amazon.jsii.Kernel.get(this, "domainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFolderIdInput() {
        return software.amazon.jsii.Kernel.get(this, "folderIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardLayout getLayoutInput() {
        return software.amazon.jsii.Kernel.get(this, "layoutInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardLayout.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPanelInput() {
        return software.amazon.jsii.Kernel.get(this, "panelInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRefreshIntervalInput() {
        return software.amazon.jsii.Kernel.get(this, "refreshIntervalInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThemeInput() {
        return software.amazon.jsii.Kernel.get(this, "themeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRange getTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "timeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTitleInput() {
        return software.amazon.jsii.Kernel.get(this, "titleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTopologyLabelMap getTopologyLabelMapInput() {
        return software.amazon.jsii.Kernel.get(this, "topologyLabelMapInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTopologyLabelMap.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getVariableInput() {
        return software.amazon.jsii.Kernel.get(this, "variableInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomain() {
        return software.amazon.jsii.Kernel.get(this, "domain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domain", java.util.Objects.requireNonNull(value, "domain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFolderId() {
        return software.amazon.jsii.Kernel.get(this, "folderId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFolderId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "folderId", java.util.Objects.requireNonNull(value, "folderId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRefreshInterval() {
        return software.amazon.jsii.Kernel.get(this, "refreshInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRefreshInterval(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "refreshInterval", java.util.Objects.requireNonNull(value, "refreshInterval is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTheme() {
        return software.amazon.jsii.Kernel.get(this, "theme", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTheme(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "theme", java.util.Objects.requireNonNull(value, "theme is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTitle() {
        return software.amazon.jsii.Kernel.get(this, "title", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTitle(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "title", java.util.Objects.requireNonNull(value, "title is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.dashboard.Dashboard}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.dashboard.Dashboard> {
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
        private final com.sumologic.dashboard.DashboardConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new com.sumologic.dashboard.DashboardConfig.Builder();
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
         * time_range block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#time_range Dashboard#time_range}
         * <p>
         * @return {@code this}
         * @param timeRange time_range block. This parameter is required.
         */
        public Builder timeRange(final com.sumologic.dashboard.DashboardTimeRange timeRange) {
            this.config.timeRange(timeRange);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#title Dashboard#title}.
         * <p>
         * @return {@code this}
         * @param title Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#title Dashboard#title}. This parameter is required.
         */
        public Builder title(final java.lang.String title) {
            this.config.title(title);
            return this;
        }

        /**
         * coloring_rule block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#coloring_rule Dashboard#coloring_rule}
         * <p>
         * @return {@code this}
         * @param coloringRule coloring_rule block. This parameter is required.
         */
        public Builder coloringRule(final com.hashicorp.cdktf.IResolvable coloringRule) {
            this.config.coloringRule(coloringRule);
            return this;
        }
        /**
         * coloring_rule block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#coloring_rule Dashboard#coloring_rule}
         * <p>
         * @return {@code this}
         * @param coloringRule coloring_rule block. This parameter is required.
         */
        public Builder coloringRule(final java.util.List<? extends com.sumologic.dashboard.DashboardColoringRule> coloringRule) {
            this.config.coloringRule(coloringRule);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#description Dashboard#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#description Dashboard#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#domain Dashboard#domain}.
         * <p>
         * @return {@code this}
         * @param domain Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#domain Dashboard#domain}. This parameter is required.
         */
        public Builder domain(final java.lang.String domain) {
            this.config.domain(domain);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#folder_id Dashboard#folder_id}.
         * <p>
         * @return {@code this}
         * @param folderId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#folder_id Dashboard#folder_id}. This parameter is required.
         */
        public Builder folderId(final java.lang.String folderId) {
            this.config.folderId(folderId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#id Dashboard#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#id Dashboard#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * layout block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#layout Dashboard#layout}
         * <p>
         * @return {@code this}
         * @param layout layout block. This parameter is required.
         */
        public Builder layout(final com.sumologic.dashboard.DashboardLayout layout) {
            this.config.layout(layout);
            return this;
        }

        /**
         * panel block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#panel Dashboard#panel}
         * <p>
         * @return {@code this}
         * @param panel panel block. This parameter is required.
         */
        public Builder panel(final com.hashicorp.cdktf.IResolvable panel) {
            this.config.panel(panel);
            return this;
        }
        /**
         * panel block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#panel Dashboard#panel}
         * <p>
         * @return {@code this}
         * @param panel panel block. This parameter is required.
         */
        public Builder panel(final java.util.List<? extends com.sumologic.dashboard.DashboardPanel> panel) {
            this.config.panel(panel);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#refresh_interval Dashboard#refresh_interval}.
         * <p>
         * @return {@code this}
         * @param refreshInterval Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#refresh_interval Dashboard#refresh_interval}. This parameter is required.
         */
        public Builder refreshInterval(final java.lang.Number refreshInterval) {
            this.config.refreshInterval(refreshInterval);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#theme Dashboard#theme}.
         * <p>
         * @return {@code this}
         * @param theme Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#theme Dashboard#theme}. This parameter is required.
         */
        public Builder theme(final java.lang.String theme) {
            this.config.theme(theme);
            return this;
        }

        /**
         * topology_label_map block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#topology_label_map Dashboard#topology_label_map}
         * <p>
         * @return {@code this}
         * @param topologyLabelMap topology_label_map block. This parameter is required.
         */
        public Builder topologyLabelMap(final com.sumologic.dashboard.DashboardTopologyLabelMap topologyLabelMap) {
            this.config.topologyLabelMap(topologyLabelMap);
            return this;
        }

        /**
         * variable block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#variable Dashboard#variable}
         * <p>
         * @return {@code this}
         * @param variable variable block. This parameter is required.
         */
        public Builder variable(final com.hashicorp.cdktf.IResolvable variable) {
            this.config.variable(variable);
            return this;
        }
        /**
         * variable block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#variable Dashboard#variable}
         * <p>
         * @return {@code this}
         * @param variable variable block. This parameter is required.
         */
        public Builder variable(final java.util.List<? extends com.sumologic.dashboard.DashboardVariable> variable) {
            this.config.variable(variable);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.dashboard.Dashboard}.
         */
        @Override
        public com.sumologic.dashboard.Dashboard build() {
            return new com.sumologic.dashboard.Dashboard(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
