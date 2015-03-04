package com.android.volley; class DefaultRetryPolicy { void a() { int a;
a=0;// .class public Lcom/android/volley/DefaultRetryPolicy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DefaultRetryPolicy.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/RetryPolicy;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DEFAULT_BACKOFF_MULT:F = 1.0f
a=0;// 
a=0;// .field public static final DEFAULT_MAX_RETRIES:I = 0x1
a=0;// 
a=0;// .field public static final DEFAULT_TIMEOUT_MS:I = 0x9c4
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mBackoffMultiplier:F
a=0;// 
a=0;// .field private mCurrentRetryCount:I
a=0;// 
a=0;// .field private mCurrentTimeoutMs:I
a=0;// 
a=0;// .field private final mMaxNumRetries:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     const/16 v0, 0x9c4
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/android/volley/DefaultRetryPolicy;-><init>(IIF)V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/android/volley/DefaultRetryPolicy;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(IIF)V
a=0;//     .locals 0
a=0;//     .param p1, "initialTimeoutMs"    # I
a=0;//     .param p2, "maxNumRetries"    # I
a=0;//     .param p3, "backoffMultiplier"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lcom/android/volley/DefaultRetryPolicy;);
a=0;//     iput p1, p0, Lcom/android/volley/DefaultRetryPolicy;->mCurrentTimeoutMs:I
a=0;// 
a=0;//     .line 59
a=0;//     iput p2, p0, Lcom/android/volley/DefaultRetryPolicy;->mMaxNumRetries:I
a=0;// 
a=0;//     .line 60
a=0;//     iput p3, p0, Lcom/android/volley/DefaultRetryPolicy;->mBackoffMultiplier:F
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCurrentRetryCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget v0, p0, Lcom/android/volley/DefaultRetryPolicy;->mCurrentRetryCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentTimeout()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget v0, p0, Lcom/android/volley/DefaultRetryPolicy;->mCurrentTimeoutMs:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected hasAttemptRemaining()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     iget v0, p0, Lcom/android/volley/DefaultRetryPolicy;->mCurrentRetryCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/android/volley/DefaultRetryPolicy;->mMaxNumRetries:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public retry(Lcom/android/volley/VolleyError;)V
a=0;//     .locals 3
a=0;//     .param p1, "error"    # Lcom/android/volley/VolleyError;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/VolleyError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget v0, p0, Lcom/android/volley/DefaultRetryPolicy;->mCurrentRetryCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/android/volley/DefaultRetryPolicy;->mCurrentRetryCount:I
a=0;// 
a=0;//     .line 86
a=0;//     iget v0, p0, Lcom/android/volley/DefaultRetryPolicy;->mCurrentTimeoutMs:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p0, Lcom/android/volley/DefaultRetryPolicy;->mCurrentTimeoutMs:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/android/volley/DefaultRetryPolicy;->mBackoffMultiplier:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/android/volley/DefaultRetryPolicy;->mCurrentTimeoutMs:I
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {p0}, Lcom/android/volley/DefaultRetryPolicy;->hasAttemptRemaining()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     throw p1
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
