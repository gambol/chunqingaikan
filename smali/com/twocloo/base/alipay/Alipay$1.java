package com.twocloo.base.alipay; class Alipay$1 { void a() { int a;
a=0;// .class Lcom/twocloo/base/alipay/Alipay$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "Alipay.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/base/alipay/Alipay;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/alipay/Alipay;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/Alipay$1;->this$0:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/Alipay$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 11
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     .line 37
a=0;//     :try_start_0
a=0;//     #v8=(Byte);
a=0;//     iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     .local v5, "strRet":Ljava/lang/String;
a=0;//     iget v7, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     packed-switch v7, :pswitch_data_0
a=0;// 
a=0;//     .line 77
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 81
a=0;//     .end local v5    # "strRet":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 41
a=0;//     .restart local v5    # "strRet":Ljava/lang/String;
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,Ljava/lang/String;);v6=(Uninit);v7=(Integer);v8=(Byte);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/base/alipay/Alipay$1;->this$0:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/base/alipay/Alipay;);
a=0;//     invoke-static {v7}, Lcom/twocloo/base/alipay/Alipay;->access$0(Lcom/twocloo/base/alipay/Alipay;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 45
a=0;//     :try_start_1
a=0;//     const-string v6, "resultStatus={"
a=0;// 
a=0;//     .line 46
a=0;//     .local v6, "tradeStatus":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "resultStatus="
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 47
a=0;//     .local v2, "imemoStart":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/2addr v2, v7
a=0;// 
a=0;//     .line 48
a=0;//     const-string v7, "};memo="
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 50
a=0;//     .local v1, "imemoEnd":I
a=0;//     #v1=(Integer);
a=0;//     if-eq v2, v8, :cond_0
a=0;// 
a=0;//     if-eq v1, v8, :cond_0
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-gt v1, v7, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {v5, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v3, Lcom/twocloo/base/alipay/ResultChecker;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/base/alipay/ResultChecker;);
a=0;//     invoke-direct {v3, v5}, Lcom/twocloo/base/alipay/ResultChecker;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 57
a=0;//     .local v3, "resultChecker":Lcom/twocloo/base/alipay/ResultChecker;
a=0;//     #v3=(Reference,Lcom/twocloo/base/alipay/ResultChecker;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/alipay/ResultChecker;->checkSign()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 58
a=0;//     .local v4, "retVal":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     if-ne v4, v7, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v7, p0, Lcom/twocloo/base/alipay/Alipay$1;->this$0:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/base/alipay/Alipay;);
a=0;//     invoke-static {v7}, Lcom/twocloo/base/alipay/Alipay;->access$1(Lcom/twocloo/base/alipay/Alipay;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\u63d0\u793a"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v9, p0, Lcom/twocloo/base/alipay/Alipay$1;->this$0:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/alipay/Alipay;);
a=0;//     invoke-static {v9}, Lcom/twocloo/base/alipay/Alipay;->access$1(Lcom/twocloo/base/alipay/Alipay;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     sget v10, Lcom/twocloo/base/R$string;->check_sign_failed:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 60
a=0;//     const v10, 0x1080027
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {v7, v8, v9, v10}, Lcom/twocloo/base/alipay/BaseHelper;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     .end local v1    # "imemoEnd":I
a=0;//     .end local v2    # "imemoStart":I
a=0;//     .end local v3    # "resultChecker":Lcom/twocloo/base/alipay/ResultChecker;
a=0;//     .end local v4    # "retVal":I
a=0;//     .end local v6    # "tradeStatus":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 71
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .end local v5    # "strRet":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 79
a=0;//     .restart local v0    # "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 62
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local v1    # "imemoEnd":I
a=0;//     .restart local v2    # "imemoStart":I
a=0;//     .restart local v3    # "resultChecker":Lcom/twocloo/base/alipay/ResultChecker;
a=0;//     .restart local v4    # "retVal":I
a=0;//     .restart local v5    # "strRet":Ljava/lang/String;
a=0;//     .restart local v6    # "tradeStatus":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :try_start_3
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Integer);v3=(Reference,Lcom/twocloo/base/alipay/ResultChecker;);v4=(Integer);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(One);v8=(Byte);v9=(Uninit);v10=(Uninit);
a=0;//     const-string v7, "9000"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v7, p0, Lcom/twocloo/base/alipay/Alipay$1;->this$0:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/base/alipay/Alipay;);
a=0;//     invoke-static {v7}, Lcom/twocloo/base/alipay/Alipay;->access$1(Lcom/twocloo/base/alipay/Alipay;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\u8ba2\u5355\u652f\u4ed8\u6210\u529f"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     sget v9, Lcom/twocloo/base/R$drawable;->infoicon:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/twocloo/base/alipay/Alipay$1;->this$0:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/base/alipay/Alipay;);
a=0;//     invoke-static {v10}, Lcom/twocloo/base/alipay/Alipay;->access$2(Lcom/twocloo/base/alipay/Alipay;)Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v7, v8, v9, v10}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;ILandroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_2
a=0;//     #v7=(Boolean);v8=(Byte);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v7, p0, Lcom/twocloo/base/alipay/Alipay$1;->this$0:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/base/alipay/Alipay;);
a=0;//     invoke-static {v7}, Lcom/twocloo/base/alipay/Alipay;->access$1(Lcom/twocloo/base/alipay/Alipay;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\u8ba2\u5355\u652f\u4ed8\u5931\u8d25"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     sget v9, Lcom/twocloo/base/R$drawable;->infoicon:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-static {v7, v8, v9, v10}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;ILandroid/content/DialogInterface$OnClickListener;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 39
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
