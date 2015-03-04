package com.tencent.tauth; class Tencent { void a() { int a;
a=0;// .class public Lcom/tencent/tauth/Tencent;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mLocationApi:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;// .field private mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     #p0=(Reference,Lcom/tencent/tauth/Tencent;);
a=0;//     iput-object p2, p0, Lcom/tencent/tauth/Tencent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 52
a=0;//     invoke-static {p1, p2}, Lcom/tencent/connect/auth/QQAuth;->createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     iput-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static checkManifestConfig(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "com.tencent.tauth.AuthActivity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     #v1=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 85
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 110
a=0;//     :try_start_1
a=0;//     new-instance v1, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "com.tencent.connect.common.AssistActivity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     #v1=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 114
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;//     :try_end_1
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 131
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 89
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 90
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u6ca1\u6709\u5728AndroidManifest.xml\u4e2d\u68c0\u6d4b\u5230com.tencent.tauth.AuthActivity,\u8bf7\u52a0\u4e0acom.tencent.open.AuthActivity,\u5e76\u914d\u7f6e<data android:scheme=\"tencent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\" />,\u8be6\u7ec6\u4fe1\u606f\u8bf7\u67e5\u770b\u5b98\u7f51\u6587\u6863."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\n\u914d\u7f6e\u793a\u4f8b\u5982\u4e0b: \n<activity\n     android:name=\"com.tencent.connect.util.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n     <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\" />\n"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</intent-filter>\n"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</activity>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     invoke-static {}, Lcom/tencent/b/a/g;->a()Lcom/tencent/b/a/g;
a=0;// 
a=0;//     const-string v2, "AndroidManifest.xml \u6ca1\u6709\u68c0\u6d4b\u5230com.tencent.tauth.AuthActivity"
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/tencent/b/a/g;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 119
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v1, "\u6ca1\u6709\u5728AndroidManifest.xml\u4e2d\u68c0\u6d4b\u5230com.tencent.connect.common.AssistActivity,\u8bf7\u52a0\u4e0acom.tencent.connect.common.AssistActivity,\u8be6\u7ec6\u4fe1\u606f\u8bf7\u67e5\u770b\u5b98\u7f51\u6587\u6863."
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\n\u914d\u7f6e\u793a\u4f8b\u5982\u4e0b: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"portrait\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 126
a=0;//     invoke-static {}, Lcom/tencent/b/a/g;->a()Lcom/tencent/b/a/g;
a=0;// 
a=0;//     const-string v2, "AndroidManifest.xml \u6ca1\u6709\u68c0\u6d4b\u5230com.tencent.connect.common.AssistActivity"
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/tencent/b/a/g;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/tauth/Tencent;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     new-instance v0, Lcom/tencent/tauth/Tencent;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/Tencent;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/tencent/tauth/Tencent;-><init>(Ljava/lang/String;Landroid/content/Context;)V
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Reference,Lcom/tencent/tauth/Tencent;);
a=0;//     invoke-static {p1, p0}, Lcom/tencent/tauth/Tencent;->checkManifestConfig(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "createInstance()  --end"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public ask(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     new-instance v0, Lcom/tencent/open/SocialApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/SocialApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 166
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApi;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/SocialApi;->ask(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 167
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public brag(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     new-instance v0, Lcom/tencent/open/SocialApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/SocialApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 193
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApi;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/SocialApi;->brag(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 194
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public challenge(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     new-instance v0, Lcom/tencent/open/SocialApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/SocialApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 200
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApi;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/SocialApi;->challenge(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 201
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteLocation(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v0, Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/LocationApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/tauth/LocationApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     iput-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     .line 186
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/tauth/LocationApi;->deleteLocation(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 187
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getAccessToken()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 382
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAppId()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getExpiresIn()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 386
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getExpireTimeInSecond()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getOpenId()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 453
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public gift(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     new-instance v0, Lcom/tencent/open/SocialApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/SocialApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 207
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApi;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/SocialApi;->gift(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 208
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public grade(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     new-instance v0, Lcom/tencent/open/SocialApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/SocialApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 278
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApi;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/SocialApi;->grade(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 279
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public invite(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     new-instance v0, Lcom/tencent/open/SocialApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/SocialApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 214
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApi;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/SocialApi;->invite(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 215
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isReady()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->isSessionValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 449
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 448
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isSessionValid()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 374
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->isSessionValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isSupportSSOLogin(Landroid/app/Activity;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 461
a=0;//     #v0=(Null);
a=0;//     const-string v1, "com.tencent.mobileqq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v1}, Lcom/tencent/utils/SystemUtils;->getAppVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 464
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 465
a=0;//     const-string v1, "\u6ca1\u6709\u5b89\u88c5\u624bQ"
a=0;// 
a=0;//     invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 473
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 468
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Lcom/tencent/utils/SystemUtils;->checkMobileQQ(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 469
a=0;//     const-string v1, "\u5df2\u5b89\u88c5\u7684\u624bQ\u7248\u672c\u652f\u6301SSO\u767b\u9646"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 470
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 472
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     const-string v1, "\u5df2\u5b89\u88c5\u7684\u624bQ\u7248\u672c\u4e0d\u652f\u6301SSO\u767b\u9646"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/auth/QQAuth;->login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public loginWithOEM(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcom/tencent/connect/auth/QQAuth;->loginWithOEM(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public logout(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 155
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v1}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActivityResult(IILandroid/content/Intent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 370
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public reAuth(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/auth/QQAuth;->reAuth(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public reactive(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     new-instance v0, Lcom/tencent/open/SocialApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/SocialApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 172
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApi;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/SocialApi;->reactive(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Lorg/json/JSONException;,
a=0;//             Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;,
a=0;//             Lcom/tencent/utils/HttpUtils$HttpStatusException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v1, p1, p2, p3}, Lcom/tencent/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public requestAsync(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 257
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public searchNearby(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     new-instance v0, Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/LocationApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/tauth/LocationApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     iput-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/tauth/LocationApi;->searchNearby(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 180
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 422
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "setAccessToken(), expiresIn = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 423
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/tencent/connect/auth/QQAuth;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 424
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAvatar(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     const-string v0, "picture"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 231
a=0;//     const-string v1, "exitAnim"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 232
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Lcom/tencent/connect/avatar/QQAvatar;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/connect/avatar/QQAvatar;);
a=0;//     iget-object v3, p0, Lcom/tencent/tauth/Tencent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     iget-object v4, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v4}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v2, v3, v4}, Lcom/tencent/connect/avatar/QQAvatar;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 233
a=0;//     #v2=(Reference,Lcom/tencent/connect/avatar/QQAvatar;);
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, p1, v0, p3, v1}, Lcom/tencent/connect/avatar/QQAvatar;->setAvatar(Landroid/app/Activity;Landroid/net/Uri;Lcom/tencent/tauth/IUiListener;I)V
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAvatar(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;II)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     const-string v0, "exitAnim"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 250
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, p4, v0}, Landroid/app/Activity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/tauth/Tencent;->setAvatar(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 252
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOpenId(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "setOpenId() --start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 438
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/tencent/connect/auth/QQAuth;->setOpenId(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 439
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "setOpenId() --end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 440
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shareToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     new-instance v0, Lcom/tencent/connect/share/QQShare;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/share/QQShare;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/connect/share/QQShare;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 267
a=0;//     #v0=(Reference,Lcom/tencent/connect/share/QQShare;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/share/QQShare;->shareToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 268
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shareToQzone(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     new-instance v0, Lcom/tencent/connect/share/QzoneShare;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/share/QzoneShare;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/connect/share/QzoneShare;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 272
a=0;//     #v0=(Reference,Lcom/tencent/connect/share/QzoneShare;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/share/QzoneShare;->shareToQzone(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 273
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showTaskGuideWindow(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     new-instance v0, Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/TaskGuide;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/TaskGuide;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 290
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/TaskGuide;->showTaskGuideWindow(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 291
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public story(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     new-instance v0, Lcom/tencent/open/SocialApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/SocialApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 223
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApi;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/SocialApi;->story(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 224
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public voice(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     new-instance v0, Lcom/tencent/open/SocialApi;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApi;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Lcom/tencent/open/SocialApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 285
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApi;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/SocialApi;->voice(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 286
a=0;//     return-void
a=0;// .end method
}}
