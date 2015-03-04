package com.weibo.sdk.android; class SslError { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/SslError;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SslError.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final SSL_EXPIRED:I = 0x1
a=0;// 
a=0;// .field public static final SSL_IDMISMATCH:I = 0x2
a=0;// 
a=0;// .field public static final SSL_MAX_ERROR:I = 0x4
a=0;// 
a=0;// .field public static final SSL_NOTYETVALID:I = 0x0
a=0;// 
a=0;// .field public static final SSL_UNTRUSTED:I = 0x3
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mCertificate:Landroid/net/http/SslCertificate;
a=0;// 
a=0;// .field mErrors:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(ILandroid/net/http/SslCertificate;)V
a=0;//     .locals 0
a=0;//     .param p1, "error"    # I
a=0;//     .param p2, "certificate"    # Landroid/net/http/SslCertificate;
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/SslError;);
a=0;//     invoke-virtual {p0, p1}, Lcom/weibo/sdk/android/SslError;->addError(I)Z
a=0;// 
a=0;//     .line 74
a=0;//     iput-object p2, p0, Lcom/weibo/sdk/android/SslError;->mCertificate:Landroid/net/http/SslCertificate;
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(ILjava/security/cert/X509Certificate;)V
a=0;//     .locals 1
a=0;//     .param p1, "error"    # I
a=0;//     .param p2, "certificate"    # Ljava/security/cert/X509Certificate;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/SslError;);
a=0;//     invoke-virtual {p0, p1}, Lcom/weibo/sdk/android/SslError;->addError(I)Z
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v0, Landroid/net/http/SslCertificate;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/net/http/SslCertificate;);
a=0;//     invoke-direct {v0, p2}, Landroid/net/http/SslCertificate;-><init>(Ljava/security/cert/X509Certificate;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/http/SslCertificate;);
a=0;//     iput-object v0, p0, Lcom/weibo/sdk/android/SslError;->mCertificate:Landroid/net/http/SslCertificate;
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addError(I)Z
a=0;//     .locals 3
a=0;//     .param p1, "error"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 100
a=0;//     #v1=(One);
a=0;//     if-ltz p1, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge p1, v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "rval":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     iget v2, p0, Lcom/weibo/sdk/android/SslError;->mErrors:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shl-int/2addr v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/weibo/sdk/android/SslError;->mErrors:I
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 100
a=0;//     .end local v0    # "rval":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCertificate()Landroid/net/http/SslCertificate;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/SslError;->mCertificate:Landroid/net/http/SslCertificate;
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/http/SslCertificate;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPrimaryError()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iget v1, p0, Lcom/weibo/sdk/android/SslError;->mErrors:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .local v0, "error":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 134
a=0;//     .end local v0    # "error":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 128
a=0;//     .restart local v0    # "error":I
a=0;//     :cond_2
a=0;//     iget v1, p0, Lcom/weibo/sdk/android/SslError;->mErrors:I
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     shl-int/2addr v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 127
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hasError(I)Z
a=0;//     .locals 5
a=0;//     .param p1, "error"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 113
a=0;//     #v1=(One);
a=0;//     if-ltz p1, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge p1, v3, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 114
a=0;//     .local v0, "rval":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     iget v3, p0, Lcom/weibo/sdk/android/SslError;->mErrors:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     shl-int v4, v1, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/2addr v3, v4
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .end local v0    # "rval":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v4=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 113
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v0    # "rval":Z
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Integer);v4=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 115
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "primary error: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/SslError;->getPrimaryError()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " certificate: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/SslError;->getCertificate()Landroid/net/http/SslCertificate;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
