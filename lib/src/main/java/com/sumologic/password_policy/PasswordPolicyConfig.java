package com.sumologic.password_policy;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.140Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.passwordPolicy.PasswordPolicyConfig")
@software.amazon.jsii.Jsii.Proxy(PasswordPolicyConfig.Jsii$Proxy.class)
public interface PasswordPolicyConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#account_lockout_duration_in_mins PasswordPolicy#account_lockout_duration_in_mins}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getAccountLockoutDurationInMins() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#account_lockout_threshold PasswordPolicy#account_lockout_threshold}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getAccountLockoutThreshold() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#failed_login_reset_duration_in_mins PasswordPolicy#failed_login_reset_duration_in_mins}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFailedLoginResetDurationInMins() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#id PasswordPolicy#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#max_length PasswordPolicy#max_length}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxLength() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#max_password_age_in_days PasswordPolicy#max_password_age_in_days}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxPasswordAgeInDays() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#min_length PasswordPolicy#min_length}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinLength() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#min_unique_passwords PasswordPolicy#min_unique_passwords}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinUniquePasswords() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_digits PasswordPolicy#must_contain_digits}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMustContainDigits() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_lowercase PasswordPolicy#must_contain_lowercase}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMustContainLowercase() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_special_chars PasswordPolicy#must_contain_special_chars}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMustContainSpecialChars() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_uppercase PasswordPolicy#must_contain_uppercase}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMustContainUppercase() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#remember_mfa PasswordPolicy#remember_mfa}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRememberMfa() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#require_mfa PasswordPolicy#require_mfa}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRequireMfa() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PasswordPolicyConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PasswordPolicyConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PasswordPolicyConfig> {
        java.lang.Number accountLockoutDurationInMins;
        java.lang.Number accountLockoutThreshold;
        java.lang.Number failedLoginResetDurationInMins;
        java.lang.String id;
        java.lang.Number maxLength;
        java.lang.Number maxPasswordAgeInDays;
        java.lang.Number minLength;
        java.lang.Number minUniquePasswords;
        java.lang.Object mustContainDigits;
        java.lang.Object mustContainLowercase;
        java.lang.Object mustContainSpecialChars;
        java.lang.Object mustContainUppercase;
        java.lang.Object rememberMfa;
        java.lang.Object requireMfa;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link PasswordPolicyConfig#getAccountLockoutDurationInMins}
         * @param accountLockoutDurationInMins Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#account_lockout_duration_in_mins PasswordPolicy#account_lockout_duration_in_mins}.
         * @return {@code this}
         */
        public Builder accountLockoutDurationInMins(java.lang.Number accountLockoutDurationInMins) {
            this.accountLockoutDurationInMins = accountLockoutDurationInMins;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getAccountLockoutThreshold}
         * @param accountLockoutThreshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#account_lockout_threshold PasswordPolicy#account_lockout_threshold}.
         * @return {@code this}
         */
        public Builder accountLockoutThreshold(java.lang.Number accountLockoutThreshold) {
            this.accountLockoutThreshold = accountLockoutThreshold;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getFailedLoginResetDurationInMins}
         * @param failedLoginResetDurationInMins Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#failed_login_reset_duration_in_mins PasswordPolicy#failed_login_reset_duration_in_mins}.
         * @return {@code this}
         */
        public Builder failedLoginResetDurationInMins(java.lang.Number failedLoginResetDurationInMins) {
            this.failedLoginResetDurationInMins = failedLoginResetDurationInMins;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#id PasswordPolicy#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMaxLength}
         * @param maxLength Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#max_length PasswordPolicy#max_length}.
         * @return {@code this}
         */
        public Builder maxLength(java.lang.Number maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMaxPasswordAgeInDays}
         * @param maxPasswordAgeInDays Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#max_password_age_in_days PasswordPolicy#max_password_age_in_days}.
         * @return {@code this}
         */
        public Builder maxPasswordAgeInDays(java.lang.Number maxPasswordAgeInDays) {
            this.maxPasswordAgeInDays = maxPasswordAgeInDays;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMinLength}
         * @param minLength Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#min_length PasswordPolicy#min_length}.
         * @return {@code this}
         */
        public Builder minLength(java.lang.Number minLength) {
            this.minLength = minLength;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMinUniquePasswords}
         * @param minUniquePasswords Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#min_unique_passwords PasswordPolicy#min_unique_passwords}.
         * @return {@code this}
         */
        public Builder minUniquePasswords(java.lang.Number minUniquePasswords) {
            this.minUniquePasswords = minUniquePasswords;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMustContainDigits}
         * @param mustContainDigits Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_digits PasswordPolicy#must_contain_digits}.
         * @return {@code this}
         */
        public Builder mustContainDigits(java.lang.Boolean mustContainDigits) {
            this.mustContainDigits = mustContainDigits;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMustContainDigits}
         * @param mustContainDigits Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_digits PasswordPolicy#must_contain_digits}.
         * @return {@code this}
         */
        public Builder mustContainDigits(com.hashicorp.cdktf.IResolvable mustContainDigits) {
            this.mustContainDigits = mustContainDigits;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMustContainLowercase}
         * @param mustContainLowercase Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_lowercase PasswordPolicy#must_contain_lowercase}.
         * @return {@code this}
         */
        public Builder mustContainLowercase(java.lang.Boolean mustContainLowercase) {
            this.mustContainLowercase = mustContainLowercase;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMustContainLowercase}
         * @param mustContainLowercase Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_lowercase PasswordPolicy#must_contain_lowercase}.
         * @return {@code this}
         */
        public Builder mustContainLowercase(com.hashicorp.cdktf.IResolvable mustContainLowercase) {
            this.mustContainLowercase = mustContainLowercase;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMustContainSpecialChars}
         * @param mustContainSpecialChars Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_special_chars PasswordPolicy#must_contain_special_chars}.
         * @return {@code this}
         */
        public Builder mustContainSpecialChars(java.lang.Boolean mustContainSpecialChars) {
            this.mustContainSpecialChars = mustContainSpecialChars;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMustContainSpecialChars}
         * @param mustContainSpecialChars Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_special_chars PasswordPolicy#must_contain_special_chars}.
         * @return {@code this}
         */
        public Builder mustContainSpecialChars(com.hashicorp.cdktf.IResolvable mustContainSpecialChars) {
            this.mustContainSpecialChars = mustContainSpecialChars;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMustContainUppercase}
         * @param mustContainUppercase Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_uppercase PasswordPolicy#must_contain_uppercase}.
         * @return {@code this}
         */
        public Builder mustContainUppercase(java.lang.Boolean mustContainUppercase) {
            this.mustContainUppercase = mustContainUppercase;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getMustContainUppercase}
         * @param mustContainUppercase Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#must_contain_uppercase PasswordPolicy#must_contain_uppercase}.
         * @return {@code this}
         */
        public Builder mustContainUppercase(com.hashicorp.cdktf.IResolvable mustContainUppercase) {
            this.mustContainUppercase = mustContainUppercase;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getRememberMfa}
         * @param rememberMfa Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#remember_mfa PasswordPolicy#remember_mfa}.
         * @return {@code this}
         */
        public Builder rememberMfa(java.lang.Boolean rememberMfa) {
            this.rememberMfa = rememberMfa;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getRememberMfa}
         * @param rememberMfa Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#remember_mfa PasswordPolicy#remember_mfa}.
         * @return {@code this}
         */
        public Builder rememberMfa(com.hashicorp.cdktf.IResolvable rememberMfa) {
            this.rememberMfa = rememberMfa;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getRequireMfa}
         * @param requireMfa Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#require_mfa PasswordPolicy#require_mfa}.
         * @return {@code this}
         */
        public Builder requireMfa(java.lang.Boolean requireMfa) {
            this.requireMfa = requireMfa;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getRequireMfa}
         * @param requireMfa Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/password_policy#require_mfa PasswordPolicy#require_mfa}.
         * @return {@code this}
         */
        public Builder requireMfa(com.hashicorp.cdktf.IResolvable requireMfa) {
            this.requireMfa = requireMfa;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getDependsOn}
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
         * Sets the value of {@link PasswordPolicyConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link PasswordPolicyConfig#getProvisioners}
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
         * @return a new instance of {@link PasswordPolicyConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PasswordPolicyConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PasswordPolicyConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PasswordPolicyConfig {
        private final java.lang.Number accountLockoutDurationInMins;
        private final java.lang.Number accountLockoutThreshold;
        private final java.lang.Number failedLoginResetDurationInMins;
        private final java.lang.String id;
        private final java.lang.Number maxLength;
        private final java.lang.Number maxPasswordAgeInDays;
        private final java.lang.Number minLength;
        private final java.lang.Number minUniquePasswords;
        private final java.lang.Object mustContainDigits;
        private final java.lang.Object mustContainLowercase;
        private final java.lang.Object mustContainSpecialChars;
        private final java.lang.Object mustContainUppercase;
        private final java.lang.Object rememberMfa;
        private final java.lang.Object requireMfa;
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
            this.accountLockoutDurationInMins = software.amazon.jsii.Kernel.get(this, "accountLockoutDurationInMins", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.accountLockoutThreshold = software.amazon.jsii.Kernel.get(this, "accountLockoutThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.failedLoginResetDurationInMins = software.amazon.jsii.Kernel.get(this, "failedLoginResetDurationInMins", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maxLength = software.amazon.jsii.Kernel.get(this, "maxLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maxPasswordAgeInDays = software.amazon.jsii.Kernel.get(this, "maxPasswordAgeInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minLength = software.amazon.jsii.Kernel.get(this, "minLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minUniquePasswords = software.amazon.jsii.Kernel.get(this, "minUniquePasswords", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.mustContainDigits = software.amazon.jsii.Kernel.get(this, "mustContainDigits", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.mustContainLowercase = software.amazon.jsii.Kernel.get(this, "mustContainLowercase", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.mustContainSpecialChars = software.amazon.jsii.Kernel.get(this, "mustContainSpecialChars", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.mustContainUppercase = software.amazon.jsii.Kernel.get(this, "mustContainUppercase", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.rememberMfa = software.amazon.jsii.Kernel.get(this, "rememberMfa", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.requireMfa = software.amazon.jsii.Kernel.get(this, "requireMfa", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
            this.accountLockoutDurationInMins = builder.accountLockoutDurationInMins;
            this.accountLockoutThreshold = builder.accountLockoutThreshold;
            this.failedLoginResetDurationInMins = builder.failedLoginResetDurationInMins;
            this.id = builder.id;
            this.maxLength = builder.maxLength;
            this.maxPasswordAgeInDays = builder.maxPasswordAgeInDays;
            this.minLength = builder.minLength;
            this.minUniquePasswords = builder.minUniquePasswords;
            this.mustContainDigits = builder.mustContainDigits;
            this.mustContainLowercase = builder.mustContainLowercase;
            this.mustContainSpecialChars = builder.mustContainSpecialChars;
            this.mustContainUppercase = builder.mustContainUppercase;
            this.rememberMfa = builder.rememberMfa;
            this.requireMfa = builder.requireMfa;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.Number getAccountLockoutDurationInMins() {
            return this.accountLockoutDurationInMins;
        }

        @Override
        public final java.lang.Number getAccountLockoutThreshold() {
            return this.accountLockoutThreshold;
        }

        @Override
        public final java.lang.Number getFailedLoginResetDurationInMins() {
            return this.failedLoginResetDurationInMins;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Number getMaxLength() {
            return this.maxLength;
        }

        @Override
        public final java.lang.Number getMaxPasswordAgeInDays() {
            return this.maxPasswordAgeInDays;
        }

        @Override
        public final java.lang.Number getMinLength() {
            return this.minLength;
        }

        @Override
        public final java.lang.Number getMinUniquePasswords() {
            return this.minUniquePasswords;
        }

        @Override
        public final java.lang.Object getMustContainDigits() {
            return this.mustContainDigits;
        }

        @Override
        public final java.lang.Object getMustContainLowercase() {
            return this.mustContainLowercase;
        }

        @Override
        public final java.lang.Object getMustContainSpecialChars() {
            return this.mustContainSpecialChars;
        }

        @Override
        public final java.lang.Object getMustContainUppercase() {
            return this.mustContainUppercase;
        }

        @Override
        public final java.lang.Object getRememberMfa() {
            return this.rememberMfa;
        }

        @Override
        public final java.lang.Object getRequireMfa() {
            return this.requireMfa;
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

            if (this.getAccountLockoutDurationInMins() != null) {
                data.set("accountLockoutDurationInMins", om.valueToTree(this.getAccountLockoutDurationInMins()));
            }
            if (this.getAccountLockoutThreshold() != null) {
                data.set("accountLockoutThreshold", om.valueToTree(this.getAccountLockoutThreshold()));
            }
            if (this.getFailedLoginResetDurationInMins() != null) {
                data.set("failedLoginResetDurationInMins", om.valueToTree(this.getFailedLoginResetDurationInMins()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getMaxLength() != null) {
                data.set("maxLength", om.valueToTree(this.getMaxLength()));
            }
            if (this.getMaxPasswordAgeInDays() != null) {
                data.set("maxPasswordAgeInDays", om.valueToTree(this.getMaxPasswordAgeInDays()));
            }
            if (this.getMinLength() != null) {
                data.set("minLength", om.valueToTree(this.getMinLength()));
            }
            if (this.getMinUniquePasswords() != null) {
                data.set("minUniquePasswords", om.valueToTree(this.getMinUniquePasswords()));
            }
            if (this.getMustContainDigits() != null) {
                data.set("mustContainDigits", om.valueToTree(this.getMustContainDigits()));
            }
            if (this.getMustContainLowercase() != null) {
                data.set("mustContainLowercase", om.valueToTree(this.getMustContainLowercase()));
            }
            if (this.getMustContainSpecialChars() != null) {
                data.set("mustContainSpecialChars", om.valueToTree(this.getMustContainSpecialChars()));
            }
            if (this.getMustContainUppercase() != null) {
                data.set("mustContainUppercase", om.valueToTree(this.getMustContainUppercase()));
            }
            if (this.getRememberMfa() != null) {
                data.set("rememberMfa", om.valueToTree(this.getRememberMfa()));
            }
            if (this.getRequireMfa() != null) {
                data.set("requireMfa", om.valueToTree(this.getRequireMfa()));
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
            struct.set("fqn", om.valueToTree("sumologic.passwordPolicy.PasswordPolicyConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PasswordPolicyConfig.Jsii$Proxy that = (PasswordPolicyConfig.Jsii$Proxy) o;

            if (this.accountLockoutDurationInMins != null ? !this.accountLockoutDurationInMins.equals(that.accountLockoutDurationInMins) : that.accountLockoutDurationInMins != null) return false;
            if (this.accountLockoutThreshold != null ? !this.accountLockoutThreshold.equals(that.accountLockoutThreshold) : that.accountLockoutThreshold != null) return false;
            if (this.failedLoginResetDurationInMins != null ? !this.failedLoginResetDurationInMins.equals(that.failedLoginResetDurationInMins) : that.failedLoginResetDurationInMins != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.maxLength != null ? !this.maxLength.equals(that.maxLength) : that.maxLength != null) return false;
            if (this.maxPasswordAgeInDays != null ? !this.maxPasswordAgeInDays.equals(that.maxPasswordAgeInDays) : that.maxPasswordAgeInDays != null) return false;
            if (this.minLength != null ? !this.minLength.equals(that.minLength) : that.minLength != null) return false;
            if (this.minUniquePasswords != null ? !this.minUniquePasswords.equals(that.minUniquePasswords) : that.minUniquePasswords != null) return false;
            if (this.mustContainDigits != null ? !this.mustContainDigits.equals(that.mustContainDigits) : that.mustContainDigits != null) return false;
            if (this.mustContainLowercase != null ? !this.mustContainLowercase.equals(that.mustContainLowercase) : that.mustContainLowercase != null) return false;
            if (this.mustContainSpecialChars != null ? !this.mustContainSpecialChars.equals(that.mustContainSpecialChars) : that.mustContainSpecialChars != null) return false;
            if (this.mustContainUppercase != null ? !this.mustContainUppercase.equals(that.mustContainUppercase) : that.mustContainUppercase != null) return false;
            if (this.rememberMfa != null ? !this.rememberMfa.equals(that.rememberMfa) : that.rememberMfa != null) return false;
            if (this.requireMfa != null ? !this.requireMfa.equals(that.requireMfa) : that.requireMfa != null) return false;
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
            int result = this.accountLockoutDurationInMins != null ? this.accountLockoutDurationInMins.hashCode() : 0;
            result = 31 * result + (this.accountLockoutThreshold != null ? this.accountLockoutThreshold.hashCode() : 0);
            result = 31 * result + (this.failedLoginResetDurationInMins != null ? this.failedLoginResetDurationInMins.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.maxLength != null ? this.maxLength.hashCode() : 0);
            result = 31 * result + (this.maxPasswordAgeInDays != null ? this.maxPasswordAgeInDays.hashCode() : 0);
            result = 31 * result + (this.minLength != null ? this.minLength.hashCode() : 0);
            result = 31 * result + (this.minUniquePasswords != null ? this.minUniquePasswords.hashCode() : 0);
            result = 31 * result + (this.mustContainDigits != null ? this.mustContainDigits.hashCode() : 0);
            result = 31 * result + (this.mustContainLowercase != null ? this.mustContainLowercase.hashCode() : 0);
            result = 31 * result + (this.mustContainSpecialChars != null ? this.mustContainSpecialChars.hashCode() : 0);
            result = 31 * result + (this.mustContainUppercase != null ? this.mustContainUppercase.hashCode() : 0);
            result = 31 * result + (this.rememberMfa != null ? this.rememberMfa.hashCode() : 0);
            result = 31 * result + (this.requireMfa != null ? this.requireMfa.hashCode() : 0);
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
