package com.twocloo.com.cn.task; class WechatGetAccessTokenTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "WechatGetAccessTokenTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/sync/EasyTask",
a=0;//         "<",
a=0;//         "Landroid/app/Activity;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Boolean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private accessTokenurl:Ljava/lang/String;
a=0;// 
a=0;// .field private access_token:Ljava/lang/String;
a=0;// 
a=0;// .field private authUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private code:Ljava/lang/String;
a=0;// 
a=0;// .field private ctx:Landroid/app/Activity;
a=0;// 
a=0;// .field private errocode:Ljava/lang/String;
a=0;// 
a=0;// .field private expires_in:Ljava/lang/String;
a=0;// 
a=0;// .field private headimgurl:Ljava/lang/String;
a=0;// 
a=0;// .field private nickname:Ljava/lang/String;
a=0;// 
a=0;// .field private openid:Ljava/lang/String;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private refreshTokenUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private refresh_token:Ljava/lang/String;
a=0;// 
a=0;// .field private userinfoUrl:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "mCode"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 86
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->errocode:Ljava/lang/String;
a=0;// 
a=0;//     .line 90
a=0;//     const-string v0, "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->accessTokenurl:Ljava/lang/String;
a=0;// 
a=0;//     .line 92
a=0;//     const-string v0, "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=%s&grant_type=refresh_token&refresh_token=%s"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->refreshTokenUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 94
a=0;//     const-string v0, "https://api.weixin.qq.com/sns/auth?access_token=%s&openid=%s"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->authUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 96
a=0;//     const-string v0, "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->userinfoUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 100
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     .line 101
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->code:Ljava/lang/String;
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private parseJson(Lorg/json/JSONObject;)V
a=0;//     .locals 1
a=0;//     .param p1, "jo"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     const-string v0, "errcode"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     const-string v0, "errcode"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->errocode:Ljava/lang/String;
a=0;// 
a=0;//     .line 174
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "access_token"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     const-string v0, "access_token"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->access_token:Ljava/lang/String;
a=0;// 
a=0;//     .line 177
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "expires_in"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 178
a=0;//     const-string v0, "expires_in"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->expires_in:Ljava/lang/String;
a=0;// 
a=0;//     .line 180
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "openid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 181
a=0;//     const-string v0, "openid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->openid:Ljava/lang/String;
a=0;// 
a=0;//     .line 183
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "refresh_token"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 184
a=0;//     const-string v0, "refresh_token"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->refresh_token:Ljava/lang/String;
a=0;// 
a=0;//     .line 186
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 15
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v12, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v12=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v11, v12}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 154
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Reference,Ljava/lang/Boolean;);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-object v11
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Boolean);v12=(Reference,Lcom/twocloo/base/common/NetType;);v13=(Uninit);v14=(Uninit);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->accessTokenurl:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x3
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     new-array v12, v12, [Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const-string v14, "wx2819d944f57342c2"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     const-string v14, "dc5efdb038daf8dc9a56f4acea89a73d"
a=0;// 
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     iget-object v14, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->code:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     invoke-static {v11, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 117
a=0;//     .local v2, "getAccesstokenUrl":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 118
a=0;//     .local v3, "jo":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->parseJson(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->errocode:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_1
a=0;// 
a=0;//     .line 120
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     #v11=(Boolean);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 124
a=0;//     .local v7, "nowTime":J
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->expires_in:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_2
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->expires_in:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     sub-long v11, v7, v11
a=0;// 
a=0;//     const-wide/32 v13, 0x6ddd00
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     cmp-long v11, v11, v13
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-lez v11, :cond_2
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->refreshTokenUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     new-array v12, v12, [Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const-string v14, "wx2819d944f57342c2"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     iget-object v14, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->refresh_token:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     invoke-static {v11, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 126
a=0;//     .local v9, "refresh_tokenUrl":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 127
a=0;//     .local v4, "job":Lorg/json/JSONObject;
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-direct {p0, v4}, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->parseJson(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->errocode:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_2
a=0;// 
a=0;//     .line 129
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     .end local v4    # "job":Lorg/json/JSONObject;
a=0;//     .end local v9    # "refresh_tokenUrl":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v9=(Conflicted);v11=(Byte);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->access_token:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_5
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->openid:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_5
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->authUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     new-array v12, v12, [Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     iget-object v14, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->access_token:Ljava/lang/String;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     iget-object v14, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->openid:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     invoke-static {v11, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 135
a=0;//     .local v1, "checkAuthUrl":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 136
a=0;//     .local v0, "authJo":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v11, "errmsg"
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_5
a=0;// 
a=0;//     .line 137
a=0;//     const-string v11, "errmsg"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 138
a=0;//     .local v6, "msg":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v11, "ok"
a=0;// 
a=0;//     invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_5
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->userinfoUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     new-array v12, v12, [Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     iget-object v14, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->access_token:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     iget-object v14, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->openid:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v14, v12, v13
a=0;// 
a=0;//     invoke-static {v11, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 141
a=0;//     .local v5, "mUserinfoUrl":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 142
a=0;//     .local v10, "userjo":Lorg/json/JSONObject;
a=0;//     #v10=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v11, "nickname"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_3
a=0;// 
a=0;//     .line 143
a=0;//     const-string v11, "nickname"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     iput-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->nickname:Ljava/lang/String;
a=0;// 
a=0;//     .line 145
a=0;//     :cond_3
a=0;//     #v11=(Conflicted);
a=0;//     const-string v11, "headimgurl"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_4
a=0;// 
a=0;//     .line 146
a=0;//     const-string v11, "headimgurl"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     iput-object v11, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->headimgurl:Ljava/lang/String;
a=0;// 
a=0;//     .line 147
a=0;//     const-string v11, "result"
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "headimagurl="
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v13, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->headimgurl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 149
a=0;//     :cond_4
a=0;//     #v11=(Conflicted);v13=(Conflicted);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 154
a=0;//     .end local v0    # "authJo":Lorg/json/JSONObject;
a=0;//     .end local v1    # "checkAuthUrl":Ljava/lang/String;
a=0;//     .end local v5    # "mUserinfoUrl":Ljava/lang/String;
a=0;//     .end local v6    # "msg":Ljava/lang/String;
a=0;//     .end local v10    # "userjo":Lorg/json/JSONObject;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Uninit);v6=(Conflicted);v10=(Uninit);v11=(Boolean);v12=(Conflicted);v14=(Conflicted);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/Boolean;)V
a=0;//     .locals 3
a=0;//     .param p1, "result"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->nickname:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u5fae\u4fe1\u767b\u5f55\u6210\u529f"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 163
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->onPostExecute(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-super {p0}, Lcom/twocloo/base/sync/EasyTask;->onPreExecute()V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->ctx:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u8f7d\u5165\u4e2d..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/WechatGetAccessTokenTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// .end method
}}
