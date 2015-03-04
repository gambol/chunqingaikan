package com.ctu.wo.sdk; class Payment { void a() { int a;
a=0;// .class public Lcom/ctu/wo/sdk/Payment;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Payment.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/ctu/wo/sdk/Payment$Result;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "com.ctu.travelsdk:Payment"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final MAX_RETRY_COUNT:I
a=0;// 
a=0;// .field final RETRY_INTERVAL:I
a=0;// 
a=0;// .field amount:I
a=0;// 
a=0;// .field appContext:Landroid/app/Activity;
a=0;// 
a=0;// .field desKey:Ljava/lang/String;
a=0;// 
a=0;// .field host:Ljava/lang/String;
a=0;// 
a=0;// .field isCommitVerUnicom:Z
a=0;// 
a=0;// .field isGetUnicom:Z
a=0;// 
a=0;// .field isSuccess:Z
a=0;// 
a=0;// .field keys:Ljava/lang/String;
a=0;// 
a=0;// .field mobile:Ljava/lang/String;
a=0;// 
a=0;// .field orderID:Ljava/lang/String;
a=0;// 
a=0;// .field postData:Ljava/lang/String;
a=0;// 
a=0;// .field productsID:I
a=0;// 
a=0;// .field request:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;// .field resultListener:Lcom/ctu/wo/sdk/Payment$Result;
a=0;// 
a=0;// .field retryCount:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Lcom/ctu/wo/sdk/Payment$Result;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/app/Activity;
a=0;//     .param p2, "listener"    # Lcom/ctu/wo/sdk/Payment$Result;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/security/InvalidParameterException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 63
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/ctu/wo/sdk/Payment;);
a=0;//     const-string v0, "CTU0409K"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/ctu/wo/sdk/Payment;->desKey:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     const-string v0, "http://ctucard.800617.com:8101/"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/ctu/wo/sdk/Payment;->host:Ljava/lang/String;
a=0;// 
a=0;//     .line 46
a=0;//     iput-boolean v2, p0, Lcom/ctu/wo/sdk/Payment;->isSuccess:Z
a=0;// 
a=0;//     .line 47
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/ctu/wo/sdk/Payment;->postData:Ljava/lang/String;
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ctu/app/utils/Request;);
a=0;//     iget-object v1, p0, Lcom/ctu/wo/sdk/Payment;->appContext:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1}, Lcom/ctu/app/utils/Request;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     iput-object v0, p0, Lcom/ctu/wo/sdk/Payment;->request:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     .line 192
a=0;//     const/16 v0, 0x5dc
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/ctu/wo/sdk/Payment;->RETRY_INTERVAL:I
a=0;// 
a=0;//     .line 193
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/ctu/wo/sdk/Payment;->MAX_RETRY_COUNT:I
a=0;// 
a=0;//     .line 198
a=0;//     iput v2, p0, Lcom/ctu/wo/sdk/Payment;->retryCount:I
a=0;// 
a=0;//     .line 285
a=0;//     iput-boolean v2, p0, Lcom/ctu/wo/sdk/Payment;->isCommitVerUnicom:Z
a=0;// 
a=0;//     .line 286
a=0;//     iput-boolean v2, p0, Lcom/ctu/wo/sdk/Payment;->isGetUnicom:Z
a=0;// 
a=0;//     .line 64
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/security/InvalidParameterException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/security/InvalidParameterException;);
a=0;//     invoke-direct {v0}, Ljava/security/InvalidParameterException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/InvalidParameterException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_1
a=0;//     #v0=(PosByte);
a=0;//     iput-object p1, p0, Lcom/ctu/wo/sdk/Payment;->appContext:Landroid/app/Activity;
a=0;// 
a=0;//     .line 69
a=0;//     iput-object p2, p0, Lcom/ctu/wo/sdk/Payment;->resultListener:Lcom/ctu/wo/sdk/Payment$Result;
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/ctu/wo/sdk/Payment;Ljava/lang/String;Ljava/lang/String;Lcom/ctu/app/utils/Request;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Lcom/ctu/wo/sdk/Payment;
a=0;//     .param p1, "x1"    # Ljava/lang/String;
a=0;//     .param p2, "x2"    # Ljava/lang/String;
a=0;//     .param p3, "x3"    # Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/ctu/wo/sdk/Payment;->postData2Server(Ljava/lang/String;Ljava/lang/String;Lcom/ctu/app/utils/Request;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Lcom/ctu/wo/sdk/Payment;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Lcom/ctu/wo/sdk/Payment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Lcom/ctu/wo/sdk/Payment;->tryConnect()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private postData2Server(Ljava/lang/String;Ljava/lang/String;Lcom/ctu/app/utils/Request;)V
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "postData"    # Ljava/lang/String;
a=0;//     .param p3, "request"    # Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/ctu/wo/sdk/Payment;->host:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/ctu/wo/sdk/Payment$4;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/ctu/wo/sdk/Payment$4;);
a=0;//     invoke-direct {v2, p0}, Lcom/ctu/wo/sdk/Payment$4;-><init>(Lcom/ctu/wo/sdk/Payment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/ctu/wo/sdk/Payment$4;);
a=0;//     invoke-virtual {p3, v0, v1, v2}, Lcom/ctu/app/utils/Request;->Post(Ljava/lang/String;[BLcom/ctu/app/utils/Request$Response;)V
a=0;// 
a=0;//     .line 399
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private tryConnect()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     .line 202
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(PosByte);
a=0;//     iget v1, p0, Lcom/ctu/wo/sdk/Payment;->retryCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v4, :cond_2
a=0;// 
a=0;//     .line 204
a=0;//     iget v1, p0, Lcom/ctu/wo/sdk/Payment;->retryCount:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/ctu/wo/sdk/Payment;->retryCount:I
a=0;// 
a=0;//     .line 207
a=0;//     const-wide/16 v1, 0x5dc
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 212
a=0;//     :goto_0
a=0;//     iget-boolean v1, p0, Lcom/ctu/wo/sdk/Payment;->isGetUnicom:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 214
a=0;//     const-string v1, "GetUnicom.aspx"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/ctu/wo/sdk/Payment;->postData:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/ctu/wo/sdk/Payment;->request:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     invoke-direct {p0, v1, v2, v3}, Lcom/ctu/wo/sdk/Payment;->postData2Server(Ljava/lang/String;Ljava/lang/String;Lcom/ctu/app/utils/Request;)V
a=0;// 
a=0;//     .line 222
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v1, p0, Lcom/ctu/wo/sdk/Payment;->retryCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v4, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1}, Lcom/ctu/wo/sdk/Payment;->ParseServerError(I)V
a=0;// 
a=0;//     .line 230
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 208
a=0;//     :catch_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 209
a=0;//     .local v0, "e":Ljava/lang/InterruptedException;
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 216
a=0;//     .end local v0    # "e":Ljava/lang/InterruptedException;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     iget-boolean v1, p0, Lcom/ctu/wo/sdk/Payment;->isCommitVerUnicom:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 218
a=0;//     const-string v1, "VerUnicom.aspx"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/ctu/wo/sdk/Payment;->postData:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/ctu/wo/sdk/Payment;->request:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     invoke-direct {p0, v1, v2, v3}, Lcom/ctu/wo/sdk/Payment;->postData2Server(Ljava/lang/String;Ljava/lang/String;Lcom/ctu/app/utils/Request;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method ParseServerError(I)V
a=0;//     .locals 3
a=0;//     .param p1, "code"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 159
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v1, "\u8fde\u63a5\u9519\u8bef"
a=0;// 
a=0;//     .line 161
a=0;//     .local v1, "title":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 170
a=0;//     :pswitch_0
a=0;//     const-string v0, "\u670d\u52a1\u5668\u7e41\u5fd9\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"
a=0;// 
a=0;//     .line 173
a=0;//     .local v0, "msg":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/ctu/wo/sdk/Payment;->ShowError(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 176
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Lcom/ctu/wo/sdk/Payment;->resultListener:Lcom/ctu/wo/sdk/Payment$Result;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ctu/wo/sdk/Payment$Result;);
a=0;//     invoke-interface {v2, p1}, Lcom/ctu/wo/sdk/Payment$Result;->GetResult(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 164
a=0;//     .end local v0    # "msg":Ljava/lang/String;
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "\u7f51\u7edc\u9519\u8bef\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"
a=0;// 
a=0;//     .line 165
a=0;//     .restart local v0    # "msg":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 167
a=0;//     .end local v0    # "msg":Ljava/lang/String;
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);
a=0;//     const-string v0, "\u89e3\u6790xml\u9519\u8bef"
a=0;// 
a=0;//     .line 168
a=0;//     .restart local v0    # "msg":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 161
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x4
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public Pay(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "productsID"    # I
a=0;//     .param p2, "orderID"    # Ljava/lang/String;
a=0;//     .param p3, "amount"    # I
a=0;//     .param p4, "mobile"    # Ljava/lang/String;
a=0;//     .param p5, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/security/InvalidParameterException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0xb
a=0;// 
a=0;//     .line 96
a=0;//     #v7=(PosByte);
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     if-lez p3, :cond_0
a=0;// 
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v6, v7, :cond_0
a=0;// 
a=0;//     invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     new-instance v6, Ljava/security/InvalidParameterException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/security/InvalidParameterException;);
a=0;//     invoke-direct {v6}, Ljava/security/InvalidParameterException;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/security/InvalidParameterException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 101
a=0;//     :cond_1
a=0;//     #v6=(Boolean);
a=0;//     if-gtz p1, :cond_2
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v6, Ljava/security/InvalidParameterException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/security/InvalidParameterException;);
a=0;//     const-string v7, "INVALID productsID"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/security/InvalidParameterException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 104
a=0;//     :cond_2
a=0;//     #v6=(Boolean);v7=(PosByte);
a=0;//     iput p1, p0, Lcom/ctu/wo/sdk/Payment;->productsID:I
a=0;// 
a=0;//     .line 107
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 108
a=0;//     new-instance v6, Ljava/security/InvalidParameterException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/security/InvalidParameterException;);
a=0;//     const-string v7, "INVALID orderID"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/security/InvalidParameterException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 110
a=0;//     :cond_3
a=0;//     #v6=(Boolean);v7=(PosByte);
a=0;//     iput-object p2, p0, Lcom/ctu/wo/sdk/Payment;->orderID:Ljava/lang/String;
a=0;// 
a=0;//     .line 113
a=0;//     if-gtz p3, :cond_4
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v6, Ljava/security/InvalidParameterException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/security/InvalidParameterException;);
a=0;//     const-string v7, "INVALID amount"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/security/InvalidParameterException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 116
a=0;//     :cond_4
a=0;//     #v6=(Boolean);v7=(PosByte);
a=0;//     iput p3, p0, Lcom/ctu/wo/sdk/Payment;->amount:I
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eq v6, v7, :cond_6
a=0;// 
a=0;//     .line 120
a=0;//     :cond_5
a=0;//     new-instance v6, Ljava/security/InvalidParameterException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/security/InvalidParameterException;);
a=0;//     const-string v7, "INVALID mobile number"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/security/InvalidParameterException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 122
a=0;//     :cond_6
a=0;//     #v6=(Integer);v7=(PosByte);
a=0;//     iput-object p4, p0, Lcom/ctu/wo/sdk/Payment;->mobile:Ljava/lang/String;
a=0;// 
a=0;//     .line 125
a=0;//     invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     .line 126
a=0;//     new-instance v6, Ljava/security/InvalidParameterException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/security/InvalidParameterException;);
a=0;//     const-string v7, "INVALID key"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/security/InvalidParameterException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 128
a=0;//     :cond_7
a=0;//     #v6=(Boolean);v7=(PosByte);
a=0;//     iput-object p5, p0, Lcom/ctu/wo/sdk/Payment;->keys:Ljava/lang/String;
a=0;// 
a=0;//     .line 131
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment;->orderID:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment;->keys:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/ctu/app/utils/MD5;->getMD5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 133
a=0;//     .local v3, "keyStr":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "productsid="
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget v7, p0, Lcom/ctu/wo/sdk/Payment;->productsID:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "&orderid="
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment;->orderID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "&mobile="
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment;->mobile:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "&Amount="
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget v7, p0, Lcom/ctu/wo/sdk/Payment;->amount:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "&key="
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 138
a=0;//     .local v0, "data":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/ctu/wo/sdk/Payment;->desKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v6}, Lcom/ctu/app/utils/Des;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 139
a=0;//     .local v1, "desData":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment;->desKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/ctu/app/utils/MD5;->getMD5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 140
a=0;//     .local v4, "md5Data":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Lcom/ctu/wo/sdk/Payment;->postData:Ljava/lang/String;
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     iput-boolean v6, p0, Lcom/ctu/wo/sdk/Payment;->isGetUnicom:Z
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iput v6, p0, Lcom/ctu/wo/sdk/Payment;->retryCount:I
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v5, Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/ctu/app/utils/Request;);
a=0;//     iget-object v6, p0, Lcom/ctu/wo/sdk/Payment;->appContext:Landroid/app/Activity;
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v5, v6}, Lcom/ctu/app/utils/Request;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 146
a=0;//     .local v5, "request":Lcom/ctu/app/utils/Request;
a=0;//     #v5=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     const-string v6, "GetUnicom.aspx"
a=0;// 
a=0;//     iget-object v7, p0, Lcom/ctu/wo/sdk/Payment;->postData:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v6, v7, v5}, Lcom/ctu/wo/sdk/Payment;->postData2Server(Ljava/lang/String;Ljava/lang/String;Lcom/ctu/app/utils/Request;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 154
a=0;//     .end local v1    # "desData":Ljava/lang/String;
a=0;//     .end local v4    # "md5Data":Ljava/lang/String;
a=0;//     .end local v5    # "request":Lcom/ctu/app/utils/Request;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 148
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 149
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 150
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     invoke-virtual {p0, v6}, Lcom/ctu/wo/sdk/Payment;->ParseServerError(I)V
a=0;// 
a=0;//     .line 151
a=0;//     const-string v6, "\u8fde\u63a5\u9519\u8bef"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "\u7f51\u7edc\u9519\u8bef\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8bbe\u7f6e"
a=0;// 
a=0;//     invoke-virtual {p0, v6, v7}, Lcom/ctu/wo/sdk/Payment;->ShowError(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method ShowError(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "title"    # Ljava/lang/String;
a=0;//     .param p2, "body"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v1, p0, Lcom/ctu/wo/sdk/Payment;->appContext:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 181
a=0;//     .local v0, "builder":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 182
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 183
a=0;//     const-string v1, "\u5173\u95ed"
a=0;// 
a=0;//     new-instance v2, Lcom/ctu/wo/sdk/Payment$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/ctu/wo/sdk/Payment$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/ctu/wo/sdk/Payment$1;-><init>(Lcom/ctu/wo/sdk/Payment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/ctu/wo/sdk/Payment$1;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     .line 190
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method ShowVerifyCodeInput()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v3, p0, Lcom/ctu/wo/sdk/Payment;->appContext:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 235
a=0;//     .local v0, "builder":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const v3, 0x108009b
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 236
a=0;//     const-string v3, "\u8bf7\u8f93\u5165\u77ed\u4fe1\u9a8c\u8bc1\u7801"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 237
a=0;//     new-instance v2, Landroid/widget/EditText;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/EditText;);
a=0;//     iget-object v3, p0, Lcom/ctu/wo/sdk/Payment;->appContext:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {v2, v3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 238
a=0;//     .local v2, "inputBox":Landroid/widget/EditText;
a=0;//     #v2=(Reference,Landroid/widget/EditText;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v1, v3, [Landroid/text/InputFilter;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/text/InputFilter;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Landroid/text/InputFilter$LengthFilter;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/text/InputFilter$LengthFilter;);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v4, v5}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/text/InputFilter$LengthFilter;);
a=0;//     aput-object v4, v1, v3
a=0;// 
a=0;//     .line 239
a=0;//     .local v1, "filters":[Landroid/text/InputFilter;
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V
a=0;// 
a=0;//     .line 240
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setInputType(I)V
a=0;// 
a=0;//     .line 241
a=0;//     invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 243
a=0;//     const-string v3, "\u786e\u8ba4"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Lcom/ctu/wo/sdk/Payment$2;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/ctu/wo/sdk/Payment$2;);
a=0;//     invoke-direct {v4, p0, v2}, Lcom/ctu/wo/sdk/Payment$2;-><init>(Lcom/ctu/wo/sdk/Payment;Landroid/widget/EditText;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/ctu/wo/sdk/Payment$2;);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 275
a=0;//     const-string v3, "\u53d6\u6d88"
a=0;// 
a=0;//     new-instance v4, Lcom/ctu/wo/sdk/Payment$3;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/ctu/wo/sdk/Payment$3;);
a=0;//     invoke-direct {v4, p0}, Lcom/ctu/wo/sdk/Payment$3;-><init>(Lcom/ctu/wo/sdk/Payment;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/ctu/wo/sdk/Payment$3;);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 282
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     .line 283
a=0;//     return-void
a=0;// .end method
}}
