package com.tencent.tauth; class LocationApi { void a() { int a;
a=0;// .class public Lcom/tencent/tauth/LocationApi;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/tauth/LocationApi$BaseRequestListener;,
a=0;//         Lcom/tencent/tauth/LocationApi$TaskRequestListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ACTION_DELETE:Ljava/lang/String; = "delete_location"
a=0;// 
a=0;// .field private static final ACTION_SEARCH:Ljava/lang/String; = "search_nearby"
a=0;// 
a=0;// .field private static final CGI_DELETE_LOCATION:Ljava/lang/String; = "http://fusion.qq.com/cgi-bin/qzapps/mapp_lbs_delete.cgi"
a=0;// 
a=0;// .field private static final CGI_SEARCH_NEARBY:Ljava/lang/String; = "http://fusion.qq.com/cgi-bin/qzapps/mapp_lbs_getnear.cgi"
a=0;// 
a=0;// .field private static final EVENT_ID_DELETE:Ljava/lang/String; = "id_delete_location"
a=0;// 
a=0;// .field private static final EVENT_ID_SEARCH:Ljava/lang/String; = "id_search_nearby"
a=0;// 
a=0;// .field private static final MSG_GET_LOCATION_TIMEOUT:I = 0x65
a=0;// 
a=0;// .field private static final MSG_VERIFY_SOSOCODE_FAILED:I = 0x68
a=0;// 
a=0;// .field private static final MSG_VERIFY_SOSOCODE_SUCCESS:I = 0x67
a=0;// 
a=0;// .field private static final PAGE_DEFAULT:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mHandlerThread:Landroid/os/HandlerThread;
a=0;// 
a=0;// .field private mLbsAgent:Lcom/tencent/tauth/LbsAgent;
a=0;// 
a=0;// .field private mMainHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mParams:Landroid/os/Bundle;
a=0;// 
a=0;// .field private mSearchListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 67
a=0;//     #p0=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     invoke-direct {p0}, Lcom/tencent/tauth/LocationApi;->init()V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     invoke-direct {p0}, Lcom/tencent/tauth/LocationApi;->init()V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/tencent/tauth/LocationApi;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Lcom/tencent/tauth/LocationApi;)Lcom/tencent/tauth/LbsAgent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mLbsAgent:Lcom/tencent/tauth/LbsAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LbsAgent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Lcom/tencent/tauth/LocationApi;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mMainHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Lcom/tencent/tauth/LocationApi;ILjava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/tauth/LocationApi;->locationFailed(ILjava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Lcom/tencent/tauth/LocationApi;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Lcom/tencent/tauth/LocationApi;)Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private checkNetworkAvailable()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 212
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "connectivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 214
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 215
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 216
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 222
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/net/ConnectivityManager;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 222
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private doSearchNearby(Landroid/location/Location;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     .line 157
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "location: search mParams: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/tauth/LocationApi;->mParams:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mParams:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 159
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mParams:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 160
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/LocationApi;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 166
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 167
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "appid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v4}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 168
a=0;//     const-string v2, "latitude"
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     const-string v2, "latitude"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v0, "longitude"
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 172
a=0;//     const-string v0, "longitude"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 175
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "page"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 177
a=0;//     const-string v0, "page"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 179
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "tencent&sdk&qazxc***14969%%"
a=0;// 
a=0;//     .line 180
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "qzone3.4"
a=0;// 
a=0;//     .line 182
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 184
a=0;//     const-string v1, "encrytoken"
a=0;// 
a=0;//     invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 185
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "location: search params: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     new-instance v5, Lcom/tencent/tauth/LocationApi$TaskRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/tauth/LocationApi$TaskRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mSearchListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-direct {v5, p0, v0}, Lcom/tencent/tauth/LocationApi$TaskRequestListener;-><init>(Lcom/tencent/tauth/LocationApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 188
a=0;//     #v5=(Reference,Lcom/tencent/tauth/LocationApi$TaskRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/LocationApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "http://fusion.qq.com/cgi-bin/qzapps/mapp_lbs_getnear.cgi"
a=0;// 
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 190
a=0;//     return-void
a=0;// 
a=0;//     .line 162
a=0;//     :cond_3
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/LocationApi;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private init()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     new-instance v0, Lcom/tencent/tauth/LbsAgent;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/LbsAgent;);
a=0;//     invoke-direct {v0}, Lcom/tencent/tauth/LbsAgent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LbsAgent;);
a=0;//     iput-object v0, p0, Lcom/tencent/tauth/LocationApi;->mLbsAgent:Lcom/tencent/tauth/LbsAgent;
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v0, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     const-string v1, "get_location"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     iput-object v0, p0, Lcom/tencent/tauth/LocationApi;->mHandlerThread:Landroid/os/HandlerThread;
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mHandlerThread:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/LocationApi;->mHandlerThread:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/tencent/tauth/LocationApi;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Lcom/tencent/tauth/LocationApi$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/LocationApi$1;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/LocationApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Lcom/tencent/tauth/LocationApi$1;-><init>(Lcom/tencent/tauth/LocationApi;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LocationApi$1;);
a=0;//     iput-object v0, p0, Lcom/tencent/tauth/LocationApi;->mMainHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private locationFailed(ILjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mLbsAgent:Lcom/tencent/tauth/LbsAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LbsAgent;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/tauth/LbsAgent;->removeUpdate()V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mSearchListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 205
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 198
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "ret"
a=0;// 
a=0;//     invoke-virtual {v1, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 199
a=0;//     const-string v0, "errMsg"
a=0;// 
a=0;//     invoke-virtual {v1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 204
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mSearchListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private locationSuccess()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mLbsAgent:Lcom/tencent/tauth/LbsAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/LbsAgent;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/tauth/LbsAgent;->removeUpdate()V
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs report(Ljava/lang/String;[Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/tauth/LocationApi$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/LocationApi$3;);
a=0;//     invoke-direct {v1, p0, p2, p1}, Lcom/tencent/tauth/LocationApi$3;-><init>(Lcom/tencent/tauth/LocationApi;[Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/LocationApi$3;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 248
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private unavailableNetworkJson()Lorg/json/JSONObject;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 228
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "ret"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, -0x9
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 229
a=0;//     const-string v0, "errMsg"
a=0;// 
a=0;//     const-string v2, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u540e\u91cd\u8bd5!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 234
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 230
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 231
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public deleteLocation(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     invoke-direct {p0}, Lcom/tencent/tauth/LocationApi;->checkNetworkAvailable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     invoke-direct {p0}, Lcom/tencent/tauth/LocationApi;->unavailableNetworkJson()Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 131
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 132
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v3, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 133
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/LocationApi;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 138
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "appid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 139
a=0;//     const-string v0, "timestamp"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     const-string v0, "tencent&sdk&qazxc***14969%%"
a=0;// 
a=0;//     .line 141
a=0;//     const-string v1, "qzone3.4"
a=0;// 
a=0;//     .line 143
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 145
a=0;//     const-string v1, "encrytoken"
a=0;// 
a=0;//     invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "location: delete params: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v5, Lcom/tencent/tauth/LocationApi$TaskRequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/tauth/LocationApi$TaskRequestListener;);
a=0;//     invoke-direct {v5, p0, p3}, Lcom/tencent/tauth/LocationApi$TaskRequestListener;-><init>(Lcom/tencent/tauth/LocationApi;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 149
a=0;//     #v5=(Reference,Lcom/tencent/tauth/LocationApi$TaskRequestListener;);
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/LocationApi;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "http://fusion.qq.com/cgi-bin/qzapps/mapp_lbs_delete.cgi"
a=0;// 
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 152
a=0;//     const-string v0, "delete_location"
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "success"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/tencent/tauth/LocationApi;->report(Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 135
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/LocationApi;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onLocationUpdate(Landroid/location/Location;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/tauth/LocationApi;->doSearchNearby(Landroid/location/Location;)V
a=0;// 
a=0;//     .line 253
a=0;//     invoke-direct {p0}, Lcom/tencent/tauth/LocationApi;->locationSuccess()V
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mMainHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/16 v1, 0x65
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 255
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public searchNearby(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-direct {p0}, Lcom/tencent/tauth/LocationApi;->checkNetworkAvailable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 103
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     invoke-direct {p0}, Lcom/tencent/tauth/LocationApi;->unavailableNetworkJson()Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 108
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iput-object p2, p0, Lcom/tencent/tauth/LocationApi;->mParams:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 109
a=0;//     iput-object p3, p0, Lcom/tencent/tauth/LocationApi;->mSearchListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/tauth/LocationApi$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/LocationApi$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/tauth/LocationApi$2;-><init>(Lcom/tencent/tauth/LocationApi;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/LocationApi$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
