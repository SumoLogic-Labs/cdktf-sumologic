package com.sumologic.password_policy;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy sumologic_password_policy}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.139Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.passwordPolicy.PasswordPolicy")
public class PasswordPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected PasswordPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PasswordPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.password_policy.PasswordPolicy.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy sumologic_password_policy} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public PasswordPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable com.sumologic.password_policy.PasswordPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy sumologic_password_policy} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public PasswordPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    /**
     * Generates CDKTF code for importing a PasswordPolicy resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the PasswordPolicy to import. This parameter is required.
     * @param importFromId The id of the existing PasswordPolicy that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the PasswordPolicy to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.password_policy.PasswordPolicy.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a PasswordPolicy resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the PasswordPolicy to import. This parameter is required.
     * @param importFromId The id of the existing PasswordPolicy that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.password_policy.PasswordPolicy.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void resetAccountLockoutDurationInMins() {
        software.amazon.jsii.Kernel.call(this, "resetAccountLockoutDurationInMins", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAccountLockoutThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetAccountLockoutThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFailedLoginResetDurationInMins() {
        software.amazon.jsii.Kernel.call(this, "resetFailedLoginResetDurationInMins", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxLength() {
        software.amazon.jsii.Kernel.call(this, "resetMaxLength", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxPasswordAgeInDays() {
        software.amazon.jsii.Kernel.call(this, "resetMaxPasswordAgeInDays", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinLength() {
        software.amazon.jsii.Kernel.call(this, "resetMinLength", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinUniquePasswords() {
        software.amazon.jsii.Kernel.call(this, "resetMinUniquePasswords", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMustContainDigits() {
        software.amazon.jsii.Kernel.call(this, "resetMustContainDigits", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMustContainLowercase() {
        software.amazon.jsii.Kernel.call(this, "resetMustContainLowercase", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMustContainSpecialChars() {
        software.amazon.jsii.Kernel.call(this, "resetMustContainSpecialChars", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMustContainUppercase() {
        software.amazon.jsii.Kernel.call(this, "resetMustContainUppercase", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRememberMfa() {
        software.amazon.jsii.Kernel.call(this, "resetRememberMfa", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequireMfa() {
        software.amazon.jsii.Kernel.call(this, "resetRequireMfa", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.Nullable java.lang.Number getAccountLockoutDurationInMinsInput() {
        return software.amazon.jsii.Kernel.get(this, "accountLockoutDurationInMinsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAccountLockoutThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "accountLockoutThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getFailedLoginResetDurationInMinsInput() {
        return software.amazon.jsii.Kernel.get(this, "failedLoginResetDurationInMinsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxLengthInput() {
        return software.amazon.jsii.Kernel.get(this, "maxLengthInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxPasswordAgeInDaysInput() {
        return software.amazon.jsii.Kernel.get(this, "maxPasswordAgeInDaysInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinLengthInput() {
        return software.amazon.jsii.Kernel.get(this, "minLengthInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinUniquePasswordsInput() {
        return software.amazon.jsii.Kernel.get(this, "minUniquePasswordsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMustContainDigitsInput() {
        return software.amazon.jsii.Kernel.get(this, "mustContainDigitsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMustContainLowercaseInput() {
        return software.amazon.jsii.Kernel.get(this, "mustContainLowercaseInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMustContainSpecialCharsInput() {
        return software.amazon.jsii.Kernel.get(this, "mustContainSpecialCharsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMustContainUppercaseInput() {
        return software.amazon.jsii.Kernel.get(this, "mustContainUppercaseInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRememberMfaInput() {
        return software.amazon.jsii.Kernel.get(this, "rememberMfaInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRequireMfaInput() {
        return software.amazon.jsii.Kernel.get(this, "requireMfaInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAccountLockoutDurationInMins() {
        return software.amazon.jsii.Kernel.get(this, "accountLockoutDurationInMins", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAccountLockoutDurationInMins(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "accountLockoutDurationInMins", java.util.Objects.requireNonNull(value, "accountLockoutDurationInMins is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAccountLockoutThreshold() {
        return software.amazon.jsii.Kernel.get(this, "accountLockoutThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAccountLockoutThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "accountLockoutThreshold", java.util.Objects.requireNonNull(value, "accountLockoutThreshold is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getFailedLoginResetDurationInMins() {
        return software.amazon.jsii.Kernel.get(this, "failedLoginResetDurationInMins", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setFailedLoginResetDurationInMins(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "failedLoginResetDurationInMins", java.util.Objects.requireNonNull(value, "failedLoginResetDurationInMins is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxLength() {
        return software.amazon.jsii.Kernel.get(this, "maxLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxLength(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxLength", java.util.Objects.requireNonNull(value, "maxLength is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxPasswordAgeInDays() {
        return software.amazon.jsii.Kernel.get(this, "maxPasswordAgeInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxPasswordAgeInDays(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxPasswordAgeInDays", java.util.Objects.requireNonNull(value, "maxPasswordAgeInDays is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinLength() {
        return software.amazon.jsii.Kernel.get(this, "minLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinLength(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minLength", java.util.Objects.requireNonNull(value, "minLength is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinUniquePasswords() {
        return software.amazon.jsii.Kernel.get(this, "minUniquePasswords", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinUniquePasswords(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minUniquePasswords", java.util.Objects.requireNonNull(value, "minUniquePasswords is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMustContainDigits() {
        return software.amazon.jsii.Kernel.get(this, "mustContainDigits", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMustContainDigits(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "mustContainDigits", java.util.Objects.requireNonNull(value, "mustContainDigits is required"));
    }

    public void setMustContainDigits(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "mustContainDigits", java.util.Objects.requireNonNull(value, "mustContainDigits is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMustContainLowercase() {
        return software.amazon.jsii.Kernel.get(this, "mustContainLowercase", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMustContainLowercase(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "mustContainLowercase", java.util.Objects.requireNonNull(value, "mustContainLowercase is required"));
    }

    public void setMustContainLowercase(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "mustContainLowercase", java.util.Objects.requireNonNull(value, "mustContainLowercase is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMustContainSpecialChars() {
        return software.amazon.jsii.Kernel.get(this, "mustContainSpecialChars", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMustContainSpecialChars(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "mustContainSpecialChars", java.util.Objects.requireNonNull(value, "mustContainSpecialChars is required"));
    }

    public void setMustContainSpecialChars(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "mustContainSpecialChars", java.util.Objects.requireNonNull(value, "mustContainSpecialChars is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMustContainUppercase() {
        return software.amazon.jsii.Kernel.get(this, "mustContainUppercase", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMustContainUppercase(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "mustContainUppercase", java.util.Objects.requireNonNull(value, "mustContainUppercase is required"));
    }

    public void setMustContainUppercase(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "mustContainUppercase", java.util.Objects.requireNonNull(value, "mustContainUppercase is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRememberMfa() {
        return software.amazon.jsii.Kernel.get(this, "rememberMfa", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRememberMfa(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "rememberMfa", java.util.Objects.requireNonNull(value, "rememberMfa is required"));
    }

    public void setRememberMfa(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "rememberMfa", java.util.Objects.requireNonNull(value, "rememberMfa is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRequireMfa() {
        return software.amazon.jsii.Kernel.get(this, "requireMfa", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRequireMfa(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "requireMfa", java.util.Objects.requireNonNull(value, "requireMfa is required"));
    }

    public void setRequireMfa(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "requireMfa", java.util.Objects.requireNonNull(value, "requireMfa is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.password_policy.PasswordPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.password_policy.PasswordPolicy> {
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
        private com.sumologic.password_policy.PasswordPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }
        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final com.hashicorp.cdktf.TerraformCount count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config().forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config().provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#account_lockout_duration_in_mins PasswordPolicy#account_lockout_duration_in_mins}.
         * <p>
         * @return {@code this}
         * @param accountLockoutDurationInMins Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#account_lockout_duration_in_mins PasswordPolicy#account_lockout_duration_in_mins}. This parameter is required.
         */
        public Builder accountLockoutDurationInMins(final java.lang.Number accountLockoutDurationInMins) {
            this.config().accountLockoutDurationInMins(accountLockoutDurationInMins);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#account_lockout_threshold PasswordPolicy#account_lockout_threshold}.
         * <p>
         * @return {@code this}
         * @param accountLockoutThreshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#account_lockout_threshold PasswordPolicy#account_lockout_threshold}. This parameter is required.
         */
        public Builder accountLockoutThreshold(final java.lang.Number accountLockoutThreshold) {
            this.config().accountLockoutThreshold(accountLockoutThreshold);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#failed_login_reset_duration_in_mins PasswordPolicy#failed_login_reset_duration_in_mins}.
         * <p>
         * @return {@code this}
         * @param failedLoginResetDurationInMins Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#failed_login_reset_duration_in_mins PasswordPolicy#failed_login_reset_duration_in_mins}. This parameter is required.
         */
        public Builder failedLoginResetDurationInMins(final java.lang.Number failedLoginResetDurationInMins) {
            this.config().failedLoginResetDurationInMins(failedLoginResetDurationInMins);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#id PasswordPolicy#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#id PasswordPolicy#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#max_length PasswordPolicy#max_length}.
         * <p>
         * @return {@code this}
         * @param maxLength Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#max_length PasswordPolicy#max_length}. This parameter is required.
         */
        public Builder maxLength(final java.lang.Number maxLength) {
            this.config().maxLength(maxLength);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#max_password_age_in_days PasswordPolicy#max_password_age_in_days}.
         * <p>
         * @return {@code this}
         * @param maxPasswordAgeInDays Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#max_password_age_in_days PasswordPolicy#max_password_age_in_days}. This parameter is required.
         */
        public Builder maxPasswordAgeInDays(final java.lang.Number maxPasswordAgeInDays) {
            this.config().maxPasswordAgeInDays(maxPasswordAgeInDays);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#min_length PasswordPolicy#min_length}.
         * <p>
         * @return {@code this}
         * @param minLength Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#min_length PasswordPolicy#min_length}. This parameter is required.
         */
        public Builder minLength(final java.lang.Number minLength) {
            this.config().minLength(minLength);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#min_unique_passwords PasswordPolicy#min_unique_passwords}.
         * <p>
         * @return {@code this}
         * @param minUniquePasswords Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#min_unique_passwords PasswordPolicy#min_unique_passwords}. This parameter is required.
         */
        public Builder minUniquePasswords(final java.lang.Number minUniquePasswords) {
            this.config().minUniquePasswords(minUniquePasswords);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_digits PasswordPolicy#must_contain_digits}.
         * <p>
         * @return {@code this}
         * @param mustContainDigits Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_digits PasswordPolicy#must_contain_digits}. This parameter is required.
         */
        public Builder mustContainDigits(final java.lang.Boolean mustContainDigits) {
            this.config().mustContainDigits(mustContainDigits);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_digits PasswordPolicy#must_contain_digits}.
         * <p>
         * @return {@code this}
         * @param mustContainDigits Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_digits PasswordPolicy#must_contain_digits}. This parameter is required.
         */
        public Builder mustContainDigits(final com.hashicorp.cdktf.IResolvable mustContainDigits) {
            this.config().mustContainDigits(mustContainDigits);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_lowercase PasswordPolicy#must_contain_lowercase}.
         * <p>
         * @return {@code this}
         * @param mustContainLowercase Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_lowercase PasswordPolicy#must_contain_lowercase}. This parameter is required.
         */
        public Builder mustContainLowercase(final java.lang.Boolean mustContainLowercase) {
            this.config().mustContainLowercase(mustContainLowercase);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_lowercase PasswordPolicy#must_contain_lowercase}.
         * <p>
         * @return {@code this}
         * @param mustContainLowercase Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_lowercase PasswordPolicy#must_contain_lowercase}. This parameter is required.
         */
        public Builder mustContainLowercase(final com.hashicorp.cdktf.IResolvable mustContainLowercase) {
            this.config().mustContainLowercase(mustContainLowercase);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_special_chars PasswordPolicy#must_contain_special_chars}.
         * <p>
         * @return {@code this}
         * @param mustContainSpecialChars Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_special_chars PasswordPolicy#must_contain_special_chars}. This parameter is required.
         */
        public Builder mustContainSpecialChars(final java.lang.Boolean mustContainSpecialChars) {
            this.config().mustContainSpecialChars(mustContainSpecialChars);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_special_chars PasswordPolicy#must_contain_special_chars}.
         * <p>
         * @return {@code this}
         * @param mustContainSpecialChars Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_special_chars PasswordPolicy#must_contain_special_chars}. This parameter is required.
         */
        public Builder mustContainSpecialChars(final com.hashicorp.cdktf.IResolvable mustContainSpecialChars) {
            this.config().mustContainSpecialChars(mustContainSpecialChars);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_uppercase PasswordPolicy#must_contain_uppercase}.
         * <p>
         * @return {@code this}
         * @param mustContainUppercase Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_uppercase PasswordPolicy#must_contain_uppercase}. This parameter is required.
         */
        public Builder mustContainUppercase(final java.lang.Boolean mustContainUppercase) {
            this.config().mustContainUppercase(mustContainUppercase);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_uppercase PasswordPolicy#must_contain_uppercase}.
         * <p>
         * @return {@code this}
         * @param mustContainUppercase Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_uppercase PasswordPolicy#must_contain_uppercase}. This parameter is required.
         */
        public Builder mustContainUppercase(final com.hashicorp.cdktf.IResolvable mustContainUppercase) {
            this.config().mustContainUppercase(mustContainUppercase);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#remember_mfa PasswordPolicy#remember_mfa}.
         * <p>
         * @return {@code this}
         * @param rememberMfa Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#remember_mfa PasswordPolicy#remember_mfa}. This parameter is required.
         */
        public Builder rememberMfa(final java.lang.Boolean rememberMfa) {
            this.config().rememberMfa(rememberMfa);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#remember_mfa PasswordPolicy#remember_mfa}.
         * <p>
         * @return {@code this}
         * @param rememberMfa Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#remember_mfa PasswordPolicy#remember_mfa}. This parameter is required.
         */
        public Builder rememberMfa(final com.hashicorp.cdktf.IResolvable rememberMfa) {
            this.config().rememberMfa(rememberMfa);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#require_mfa PasswordPolicy#require_mfa}.
         * <p>
         * @return {@code this}
         * @param requireMfa Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#require_mfa PasswordPolicy#require_mfa}. This parameter is required.
         */
        public Builder requireMfa(final java.lang.Boolean requireMfa) {
            this.config().requireMfa(requireMfa);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#require_mfa PasswordPolicy#require_mfa}.
         * <p>
         * @return {@code this}
         * @param requireMfa Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#require_mfa PasswordPolicy#require_mfa}. This parameter is required.
         */
        public Builder requireMfa(final com.hashicorp.cdktf.IResolvable requireMfa) {
            this.config().requireMfa(requireMfa);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.password_policy.PasswordPolicy}.
         */
        @Override
        public com.sumologic.password_policy.PasswordPolicy build() {
            return new com.sumologic.password_policy.PasswordPolicy(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private com.sumologic.password_policy.PasswordPolicyConfig.Builder config() {
            if (this.config == null) {
                this.config = new com.sumologic.password_policy.PasswordPolicyConfig.Builder();
            }
            return this.config;
        }
    }
}
