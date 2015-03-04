package com.twocloo.com.cn.common; class JavaScript$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/common/JavaScript$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "JavaScript.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/common/JavaScript;->preOrder(Ljava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;// .field private final synthetic val$phoneNo:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/common/JavaScript;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->val$phoneNo:Ljava/lang/String;
a=0;// 
a=0;//     .line 190
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/JavaScript$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 194
a=0;//     #v10=(Null);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/HttpComm;->isNetworkAvalible(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 216
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Ljava/lang/String;);
a=0;//     return-void
a=0;// 
a=0;//     .line 198
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 200
a=0;//     .local v4, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->val$phoneNo:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/User;->setTel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/JavaScript;->access$1(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/webkit/WebView;->clearHistory()V
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/JavaScript;->access$1(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 209
a=0;//     .local v0, "apptype":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 210
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 211
a=0;//     .local v2, "srcid":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 212
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/user-sub_app_bind_mobile?uid=%s&token=%s&mobile=%s&ct=android&pt=%s&v=%s&srcid=%s&imei=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x7
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v8, v10
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->val$phoneNo:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v8, v11
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x6
a=0;// 
a=0;//     aput-object v1, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 213
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 214
a=0;//     .local v3, "url":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/common/JavaScript$2;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/common/JavaScript;->access$1(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
