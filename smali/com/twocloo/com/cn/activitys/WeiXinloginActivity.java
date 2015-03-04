package com.twocloo.com.cn.activitys; class WeiXinloginActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;
a=0;// .super Lcn/sharesdk/framework/FakeActivity;
a=0;// .source "WeiXinloginActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Handler$Callback;
a=0;// .implements Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MSG_AUTH_CANCEL:I = 0x2
a=0;// 
a=0;// .field private static final MSG_AUTH_COMPLETE:I = 0x4
a=0;// 
a=0;// .field private static final MSG_AUTH_ERROR:I = 0x3
a=0;// 
a=0;// .field private static final MSG_SMSSDK_CALLBACK:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private signupListener:Lcom/twocloo/com/cn/listener/OnLoginListener;
a=0;// 
a=0;// .field private tag:Ljava/lang/String;
a=0;// 
a=0;// .field private wechat_handler:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/FakeActivity;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->wechat_handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->tag:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->wechat_handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private authorize(Lcn/sharesdk/framework/Platform;)V
a=0;//     .locals 1
a=0;//     .param p1, "plat"    # Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1, p0}, Lcn/sharesdk/framework/Platform;->setPlatformActionListener(Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;// 
a=0;//     .line 99
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p1, v0}, Lcn/sharesdk/framework/Platform;->SSOSetting(Z)V
a=0;// 
a=0;//     .line 100
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Lcn/sharesdk/framework/Platform;->showUser(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initSDK(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/ShareSDK;->initSDK(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 243
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)Z
a=0;//     .locals 16
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget v13, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     packed-switch v13, :pswitch_data_0
a=0;// 
a=0;//     .line 233
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     return v13
a=0;// 
a=0;//     .line 130
a=0;//     :pswitch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Integer);v14=(Uninit);v15=(Uninit);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :pswitch_1
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v13=(Reference,Landroid/app/Activity;);
a=0;//     const-string v14, "\u5fae\u4fe1\u767b\u5f55\uff0c\u9700\u8981\u5fae\u4fe1\u5ba2\u6237\u7aef"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-static {v13, v14, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 138
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :pswitch_2
a=0;//     #v13=(Integer);v14=(Uninit);v15=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v4, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 145
a=0;//     .local v4, "objs":[Ljava/lang/Object;
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     aget-object v7, v4, v13
a=0;// 
a=0;//     #v7=(Null);
a=0;//     check-cast v7, Ljava/lang/String;
a=0;// 
a=0;//     .line 146
a=0;//     .local v7, "platform":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     aget-object v9, v4, v13
a=0;// 
a=0;//     #v9=(Null);
a=0;//     check-cast v9, Ljava/util/HashMap;
a=0;// 
a=0;//     .line 148
a=0;//     .local v9, "res":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v9=(Reference,Ljava/util/HashMap;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->signupListener:Lcom/twocloo/com/cn/listener/OnLoginListener;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/listener/OnLoginListener;);
a=0;//     if-eqz v13, :cond_1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->signupListener:Lcom/twocloo/com/cn/listener/OnLoginListener;
a=0;// 
a=0;//     invoke-interface {v13, v7, v9}, Lcom/twocloo/com/cn/listener/OnLoginListener;->onSignin(Ljava/lang/String;Ljava/util/HashMap;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_1
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {v7}, Lcn/sharesdk/framework/ShareSDK;->getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 151
a=0;//     .local v6, "plat":Lcn/sharesdk/framework/Platform;
a=0;//     #v6=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v6}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Lcn/sharesdk/framework/PlatformDb;);
a=0;//     invoke-virtual {v13}, Lcn/sharesdk/framework/PlatformDb;->getUserGender()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 153
a=0;//     .local v3, "genderString":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 155
a=0;//     .local v12, "username":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v6}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Lcn/sharesdk/framework/PlatformDb;->getUserName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, "gbk"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v13, v14}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 160
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v12=(Reference,Ljava/lang/String;);v14=(Conflicted);
a=0;//     invoke-virtual {v6}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Lcn/sharesdk/framework/PlatformDb;->getUserId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 161
a=0;//     .local v5, "openId":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Lcn/sharesdk/framework/PlatformDb;->getUserIcon()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 162
a=0;//     .local v8, "profileUrl":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 163
a=0;//     .local v2, "gender":I
a=0;//     #v2=(Null);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     const-string v13, "m"
a=0;// 
a=0;//     invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     .line 165
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v2=(Boolean);v13=(Conflicted);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 171
a=0;//     .local v10, "token":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "http://app.2cloo.com/login-weixin&profileImage="
a=0;// 
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, "&nickname="
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, "&wxid="
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 172
a=0;//     const-string v14, "&gender="
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, "&aboutMe=&birthday=&sign="
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 171
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 173
a=0;//     .local v11, "url":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v13, Ljava/lang/Thread;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v14, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v14, v0, v11, v8}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/activitys/WeiXinloginActivity$2;);
a=0;//     invoke-direct {v13, v14}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 225
a=0;//     #v13=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v13}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 228
a=0;//     .end local v2    # "gender":I
a=0;//     .end local v3    # "genderString":Ljava/lang/String;
a=0;//     .end local v5    # "openId":Ljava/lang/String;
a=0;//     .end local v6    # "plat":Lcn/sharesdk/framework/Platform;
a=0;//     .end local v8    # "profileUrl":Ljava/lang/String;
a=0;//     .end local v10    # "token":Ljava/lang/String;
a=0;//     .end local v11    # "url":Ljava/lang/String;
a=0;//     .end local v12    # "username":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     .restart local v3    # "genderString":Ljava/lang/String;
a=0;//     .restart local v6    # "plat":Lcn/sharesdk/framework/Platform;
a=0;//     .restart local v12    # "username":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Reference,Lcn/sharesdk/framework/Platform;);v8=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Null);v13=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 158
a=0;//     .local v1, "e1":Ljava/io/UnsupportedEncodingException;
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 167
a=0;//     .end local v1    # "e1":Ljava/io/UnsupportedEncodingException;
a=0;//     .restart local v2    # "gender":I
a=0;//     .restart local v5    # "openId":Ljava/lang/String;
a=0;//     .restart local v8    # "profileUrl":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Null);v5=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v12=(Reference,Ljava/lang/String;);v13=(Boolean);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 128
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;//     .locals 2
a=0;//     .param p1, "platform"    # Lcn/sharesdk/framework/Platform;
a=0;//     .param p2, "action"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;//     .locals 4
a=0;//     .param p1, "platform"    # Lcn/sharesdk/framework/Platform;
a=0;//     .param p2, "action"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcn/sharesdk/framework/Platform;",
a=0;//             "I",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     .local p3, "res":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p2, v1, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "msg":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 107
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput-object p3, v1, v2
a=0;// 
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 110
a=0;//     .end local v0    # "msg":Landroid/os/Message;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 86
a=0;//     sget-object v1, Lcn/sharesdk/wechat/friends/Wechat;->NAME:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/ShareSDK;->getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "wechat":Lcn/sharesdk/framework/Platform;
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->authorize(Lcn/sharesdk/framework/Platform;)V
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;//     .locals 2
a=0;//     .param p1, "platform"    # Lcn/sharesdk/framework/Platform;
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "t"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnLoginListener(Lcom/twocloo/com/cn/listener/OnLoginListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "l"    # Lcom/twocloo/com/cn/listener/OnLoginListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->signupListener:Lcom/twocloo/com/cn/listener/OnLoginListener;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/activitys/WeiXinloginActivity;->initSDK(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 238
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-super {p0, p1, v0}, Lcn/sharesdk/framework/FakeActivity;->show(Landroid/content/Context;Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 239
a=0;//     return-void
a=0;// .end method
}}
