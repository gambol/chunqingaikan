package com.tencent.connect.common; class BaseApi { void a() { int a;
a=0;// .class public abstract Lcom/tencent/connect/common/BaseApi;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/connect/common/BaseApi$TempRequestListener;,
a=0;//         Lcom/tencent/connect/common/BaseApi$ApiTask;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static final ACTION_CHECK_TOKEN:Ljava/lang/String; = "action_check_token"
a=0;// 
a=0;// .field protected static final ACTIVITY_AGENT:Ljava/lang/String; = "com.tencent.open.agent.AgentActivity"
a=0;// 
a=0;// .field protected static final ACTIVITY_ENCRY_TOKEN:Ljava/lang/String; = "com.tencent.open.agent.EncryTokenActivity"
a=0;// 
a=0;// .field protected static final DEFAULT_PF:Ljava/lang/String; = "openmobile_android"
a=0;// 
a=0;// .field private static final KEY_REQUEST_CODE:Ljava/lang/String; = "key_request_code"
a=0;// 
a=0;// .field private static final MSG_COMPLETE:I = 0x0
a=0;// 
a=0;// .field protected static final PARAM_ENCRY_EOKEN:Ljava/lang/String; = "encry_token"
a=0;// 
a=0;// .field protected static final PLATFORM:Ljava/lang/String; = "desktop_m_qq"
a=0;// 
a=0;// .field protected static final PREFERENCE_PF:Ljava/lang/String; = "pfStore"
a=0;// 
a=0;// .field protected static final VERSION:Ljava/lang/String; = "android"
a=0;// 
a=0;// .field public static businessId:Ljava/lang/String;
a=0;// 
a=0;// .field public static installChannel:Ljava/lang/String;
a=0;// 
a=0;// .field public static isOEM:Z
a=0;// 
a=0;// .field public static registerChannel:Ljava/lang/String;
a=0;// 
a=0;// .field protected static sRequestCode:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;// .field protected mContext:Landroid/content/Context;
a=0;// 
a=0;// .field protected mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;// .field protected mTaskList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/tencent/connect/common/BaseApi$ApiTask;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;// .field protected mUiListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     #v1=(Null);
a=0;//     const/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lcom/tencent/connect/common/BaseApi;->sRequestCode:I
a=0;// 
a=0;//     .line 56
a=0;//     sput-object v1, Lcom/tencent/connect/common/BaseApi;->registerChannel:Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     sput-object v1, Lcom/tencent/connect/common/BaseApi;->installChannel:Ljava/lang/String;
a=0;// 
a=0;//     .line 58
a=0;//     sput-object v1, Lcom/tencent/connect/common/BaseApi;->businessId:Ljava/lang/String;
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/tencent/connect/common/BaseApi;->isOEM:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/tencent/connect/common/BaseApi;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mTaskList:Ljava/util/List;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 53
a=0;//     iput-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mUiListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 66
a=0;//     iput-object p1, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 67
a=0;//     iput-object p2, p0, Lcom/tencent/connect/common/BaseApi;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;
a=0;// 
a=0;//     .line 68
a=0;//     iput-object p3, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mTaskList:Ljava/util/List;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 74
a=0;//     #p0=(Reference,Lcom/tencent/connect/common/BaseApi;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getAssitIntent()Landroid/content/Intent;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-class v2, Lcom/tencent/connect/common/AssistActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 207
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected composeActivityParams()Landroid/os/Bundle;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 177
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "appid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     const-string v1, "keystr"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 181
a=0;//     const-string v1, "keytype"
a=0;// 
a=0;//     const-string v2, "0x80"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 184
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 185
a=0;//     const-string v2, "hopenid"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     :cond_1
a=0;//     const-string v1, "platform"
a=0;// 
a=0;//     const-string v2, "androidqz"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "pfStore"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 192
a=0;//     sget-boolean v2, Lcom/tencent/connect/common/BaseApi;->isOEM:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 193
a=0;//     const-string v1, "pf"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "desktop_m_qq-"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/connect/common/BaseApi;->installChannel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "android"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/connect/common/BaseApi;->registerChannel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/connect/common/BaseApi;->businessId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 199
a=0;//     :goto_0
a=0;//     const-string v1, "sdkv"
a=0;// 
a=0;//     const-string v2, "2.2.1"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 200
a=0;//     const-string v1, "sdkp"
a=0;// 
a=0;//     const-string v2, "a"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 202
a=0;//     return-object v0
a=0;// 
a=0;//     .line 195
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(Null);
a=0;//     const-string v2, "pf"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "openmobile_android"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 196
a=0;//     const-string v2, "pf"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     const-string v1, "pf"
a=0;// 
a=0;//     const-string v2, "openmobile_android"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected composeCGIParams()Landroid/os/Bundle;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 148
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "format"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "json"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 149
a=0;//     const-string v1, "status_os"
a=0;// 
a=0;//     sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     const-string v1, "status_machine"
a=0;// 
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 151
a=0;//     const-string v1, "status_version"
a=0;// 
a=0;//     sget-object v2, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 152
a=0;//     const-string v1, "sdkv"
a=0;// 
a=0;//     const-string v2, "2.2.1"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 153
a=0;//     const-string v1, "sdkp"
a=0;// 
a=0;//     const-string v2, "a"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     const-string v1, "access_token"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 156
a=0;//     const-string v1, "oauth_consumer_key"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     const-string v1, "openid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "appid_for_getting_config"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "pfStore"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 166
a=0;//     sget-boolean v2, Lcom/tencent/connect/common/BaseApi;->isOEM:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 167
a=0;//     const-string v1, "pf"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "desktop_m_qq-"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/connect/common/BaseApi;->installChannel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "android"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/connect/common/BaseApi;->registerChannel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/connect/common/BaseApi;->businessId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 172
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Null);
a=0;//     const-string v2, "pf"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "openmobile_android"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 170
a=0;//     const-string v2, "pf"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getActivityIntent()Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getAgentIntent()Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     const-string v0, "com.tencent.open.agent.AgentActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/common/BaseApi;->getTargetActivityIntent(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getAgentIntentWithTarget(Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 281
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 283
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/connect/common/BaseApi;->getTargetActivityIntent(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 284
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 298
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/content/Intent;);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 291
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Uninit);
a=0;//     invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/ComponentName;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 292
a=0;//     invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "com.tencent.open.agent.AgentActivity"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected getTargetActivityIntent(Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 240
a=0;//     #v1=(Null);
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v3}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 241
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v0, Lcom/tencent/connect/common/Constants;->PACKAGE_QZONE:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 242
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 243
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v2, Lcom/tencent/connect/common/Constants;->PACKAGE_QQ:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v4, Lcom/tencent/connect/common/Constants;->PACKAGE_QZONE:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lcom/tencent/utils/SystemUtils;->getAppVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 246
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 247
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/tencent/utils/SystemUtils;->isActivityExist(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 268
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/content/Intent;);v2=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Boolean);v5=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 247
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 249
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/content/Intent;);v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/connect/common/BaseApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v5}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 251
a=0;//     const-string v5, "Common_SSO_QzoneVersion"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/tencent/utils/OpenConfig;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 252
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 253
a=0;//     const-string v2, "4.0"
a=0;// 
a=0;//     .line 256
a=0;//     :cond_3
a=0;//     const-string v5, "3.4"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Lcom/tencent/utils/SystemUtils;->compareVersion(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ltz v5, :cond_5
a=0;// 
a=0;//     invoke-static {v4, v2}, Lcom/tencent/utils/SystemUtils;->compareVersion(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_5
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/utils/SystemUtils;->isActivityExist(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v4, Lcom/tencent/connect/common/Constants;->SIGNATRUE_QZONE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v2, v4}, Lcom/tencent/utils/SystemUtils;->isAppSignatureValid(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Reference,Landroid/content/Intent;);v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 263
a=0;//     :cond_5
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2, v0}, Lcom/tencent/utils/SystemUtils;->isActivityExist(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/utils/SystemUtils;->isActivityExist(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v4, Lcom/tencent/connect/common/Constants;->SIGNATRUE_QZONE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v2, v4}, Lcom/tencent/utils/SystemUtils;->isAppSignatureValid(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected hasActivityForIntent()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/utils/SystemUtils;->isActivityExist(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 223
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/Intent;);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/BaseApi;->mTaskList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/connect/common/BaseApi$ApiTask;
a=0;// 
a=0;//     .line 92
a=0;//     iget v3, v0, Lcom/tencent/connect/common/BaseApi$ApiTask;->mRequestCode:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p1, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v1, v0, Lcom/tencent/connect/common/BaseApi$ApiTask;->mListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 94
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/common/BaseApi;->mTaskList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 99
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 133
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :cond_2
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne p2, v0, :cond_5
a=0;// 
a=0;//     .line 104
a=0;//     const-string v0, "key_error_code"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p3, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 105
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 106
a=0;//     const-string v0, "key_response"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 107
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 109
a=0;//     :try_start_0
a=0;//     invoke-static {v2}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 110
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 132
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/b/a/g;->a()Lcom/tencent/b/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/g;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/b/a/g;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     :catch_0
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 112
a=0;//     new-instance v3, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v4, -0x4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const-string v5, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v5, v2}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v1, v3}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 114
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenUi, onActivityResult, json error"
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 118
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenUi, onActivityResult, onComplete"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 123
a=0;//     :cond_4
a=0;//     #v0=(Integer);v2=(Null);
a=0;//     const-string v2, "openSDK_LOG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "OpenUi, onActivityResult, onError = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/b/a/g;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 124
a=0;//     const-string v2, "key_error_msg"
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 125
a=0;//     const-string v3, "key_error_detail"
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 126
a=0;//     new-instance v4, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-direct {v4, v0, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v1, v4}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 129
a=0;//     :cond_5
a=0;//     #v0=(Byte);v3=(Conflicted);v4=(Uninit);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "OpenUi, onActivityResult, Constants.ACTIVITY_CANCEL"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 130
a=0;//     invoke-interface {v1}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     invoke-static {p0}, Lcom/tencent/connect/common/AssistActivity;->setApiObject(Lcom/tencent/connect/common/BaseApi;)V
a=0;// 
a=0;//     .line 212
a=0;//     sget v0, Lcom/tencent/connect/common/BaseApi;->sRequestCode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sput v1, Lcom/tencent/connect/common/BaseApi;->sRequestCode:I
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "key_request_code"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/BaseApi;->mTaskList:Ljava/util/List;
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/connect/common/BaseApi$ApiTask;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/connect/common/BaseApi$ApiTask;);
a=0;//     invoke-direct {v2, p0, v0, p2}, Lcom/tencent/connect/common/BaseApi$ApiTask;-><init>(Lcom/tencent/connect/common/BaseApi;ILcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/common/BaseApi$ApiTask;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 215
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/common/BaseApi;->getAssitIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 216
a=0;//     return-void
a=0;// .end method
}}
