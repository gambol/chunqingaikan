package com.tencent.connect.auth; class QQAuth { void a() { int a;
a=0;// .class public Lcom/tencent/connect/auth/QQAuth;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/tencent/connect/auth/QQAuth;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;// .field private b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/connect/auth/QQAuth;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "new Tencent() --start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v0, Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-direct {v0, p1}, Lcom/tencent/connect/auth/QQToken;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-direct {v0, p2, v1}, Lcom/tencent/connect/auth/AuthAgent;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-static {p2, v0}, Lcom/tencent/connect/a/a;->c(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 40
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "new Tencent() --end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/connect/auth/QQAuth;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/b/b/b;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 54
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "createInstance() --start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     sget-object v0, Lcom/tencent/connect/auth/QQAuth;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/tencent/connect/auth/QQAuth;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     new-instance v1, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "com.tencent.tauth.AuthActivity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     #v1=(Reference,Landroid/content/ComponentName;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v1, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "com.tencent.connect.common.AssistActivity"
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     #v1=(Reference,Landroid/content/ComponentName;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/tencent/connect/auth/QQAuth;-><init>(Ljava/lang/String;Landroid/content/Context;)V
a=0;// 
a=0;//     .line 83
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQAuth;);
a=0;//     sget-object v1, Lcom/tencent/connect/auth/QQAuth;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 85
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "createInstance()  --end"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 86
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/connect/auth/QQAuth;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "createInstance() ,sessionMap.containsKey --end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     sget-object v0, Lcom/tencent/connect/auth/QQAuth;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 74
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "createInstance() error --end"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u8bf7\u53c2\u7167\u6587\u6863\u5728Androidmanifest.xml\u52a0\u4e0aAuthActivity\u548cAssitActivity\u7684\u5b9a\u4e49 "
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getQQToken()Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isSessionValid()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "isSessionValid(), result = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 222
a=0;//     :cond_0
a=0;//     const-string v0, "false"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "login()"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 113
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/tencent/connect/common/BaseApi;->isOEM:Z
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public loginWithOEM(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "loginWithOEM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/tencent/connect/common/BaseApi;->isOEM:Z
a=0;// 
a=0;//     .line 133
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     const-string p4, "null"
a=0;// 
a=0;//     .line 136
a=0;//     :cond_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     const-string p5, "null"
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 140
a=0;//     const-string p6, "null"
a=0;// 
a=0;//     .line 142
a=0;//     :cond_2
a=0;//     sput-object p5, Lcom/tencent/connect/common/BaseApi;->installChannel:Ljava/lang/String;
a=0;// 
a=0;//     .line 143
a=0;//     sput-object p4, Lcom/tencent/connect/common/BaseApi;->registerChannel:Ljava/lang/String;
a=0;// 
a=0;//     .line 144
a=0;//     sput-object p6, Lcom/tencent/connect/common/BaseApi;->businessId:Ljava/lang/String;
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
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
a=0;//     .line 180
a=0;//     #v2=(Null);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "logout() --start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 181
a=0;//     invoke-static {p1}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {p0, v2, v2}, Lcom/tencent/connect/auth/QQAuth;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {p0, p1, v2}, Lcom/tencent/connect/auth/QQAuth;->setOpenId(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 188
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "logout() --end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActivityResult(IILandroid/content/Intent;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "onActivityResult() ,resultCode = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/auth/AuthAgent;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 266
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public reAuth(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 168
a=0;//     #v4=(One);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "reAuth()"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;ZZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "setAccessToken(), validTimeInSecond = "
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
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 213
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOpenId(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "setOpenId() --start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/tencent/connect/a/a;->d(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 239
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "setOpenId() --end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 240
a=0;//     return-void
a=0;// .end method
}}
