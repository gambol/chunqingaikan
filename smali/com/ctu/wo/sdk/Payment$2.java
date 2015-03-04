package com.ctu.wo.sdk; class Payment$2 { void a() { int a;
a=0;// .class Lcom/ctu/wo/sdk/Payment$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Payment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/ctu/wo/sdk/Payment;->ShowVerifyCodeInput()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;// .field final synthetic val$inputBox:Landroid/widget/EditText;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/ctu/wo/sdk/Payment;Landroid/widget/EditText;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     iput-object p1, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/ctu/wo/sdk/Payment$2;->val$inputBox:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ctu/wo/sdk/Payment$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 10
a=0;//     .param p1, "dialogInterface"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V
a=0;// 
a=0;//     .line 247
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment$2;->val$inputBox:Landroid/widget/EditText;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v7}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 249
a=0;//     .local v6, "verificationCode":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     #v8=(Reference,Lcom/ctu/wo/sdk/Payment;);
a=0;//     iget-object v8, v8, Lcom/ctu/wo/sdk/Payment;->orderID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iget-object v8, v8, Lcom/ctu/wo/sdk/Payment;->mobile:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iget v8, v8, Lcom/ctu/wo/sdk/Payment;->amount:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     #v8=(Reference,Lcom/ctu/wo/sdk/Payment;);
a=0;//     iget-object v8, v8, Lcom/ctu/wo/sdk/Payment;->keys:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/ctu/app/utils/MD5;->getMD5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 252
a=0;//     .local v3, "keyStr":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "productsid="
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iget v8, v8, Lcom/ctu/wo/sdk/Payment;->productsID:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "&orderid="
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iget-object v8, v8, Lcom/ctu/wo/sdk/Payment;->orderID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "&mobile="
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iget-object v8, v8, Lcom/ctu/wo/sdk/Payment;->mobile:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "&Amount="
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iget v8, v8, Lcom/ctu/wo/sdk/Payment;->amount:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "&VerificationCode="
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "&key="
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 259
a=0;//     .local v0, "data":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iget-object v7, v7, Lcom/ctu/wo/sdk/Payment;->desKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v7}, Lcom/ctu/app/utils/Des;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 260
a=0;//     .local v1, "desData":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iget-object v8, v8, Lcom/ctu/wo/sdk/Payment;->desKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/ctu/app/utils/MD5;->getMD5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 261
a=0;//     .local v4, "md5Data":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iput-object v8, v7, Lcom/ctu/wo/sdk/Payment;->postData:Ljava/lang/String;
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     iput-boolean v8, v7, Lcom/ctu/wo/sdk/Payment;->isCommitVerUnicom:Z
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     iput v8, v7, Lcom/ctu/wo/sdk/Payment;->retryCount:I
a=0;// 
a=0;//     .line 264
a=0;//     new-instance v5, Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/ctu/app/utils/Request;);
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     iget-object v7, v7, Lcom/ctu/wo/sdk/Payment;->appContext:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {v5, v7}, Lcom/ctu/app/utils/Request;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 265
a=0;//     .local v5, "request":Lcom/ctu/app/utils/Request;
a=0;//     #v5=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     const-string v8, "VerUnicom.aspx"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v9, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     #v9=(Reference,Lcom/ctu/wo/sdk/Payment;);
a=0;//     iget-object v9, v9, Lcom/ctu/wo/sdk/Payment;->postData:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v7, v8, v9, v5}, Lcom/ctu/wo/sdk/Payment;->access$000(Lcom/ctu/wo/sdk/Payment;Ljava/lang/String;Ljava/lang/String;Lcom/ctu/app/utils/Request;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 271
a=0;//     .end local v1    # "desData":Ljava/lang/String;
a=0;//     .end local v4    # "md5Data":Ljava/lang/String;
a=0;//     .end local v5    # "request":Lcom/ctu/app/utils/Request;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 267
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 268
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment$2;->this$0:Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/ctu/wo/sdk/Payment;);
a=0;//     const/4 v8, -0x2
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     invoke-virtual {v7, v8}, Lcom/ctu/wo/sdk/Payment;->ParseServerError(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
