package com.android.volley.toolbox; class NetworkImageView$1 { void a() { int a;
a=0;// .class Lcom/android/volley/toolbox/NetworkImageView$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NetworkImageView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/android/volley/toolbox/NetworkImageView;->loadImageIfNecessary(Z)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;// .field private final synthetic val$isInLayoutPass:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/android/volley/toolbox/NetworkImageView;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     iput-boolean p2, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->val$isInLayoutPass:Z
a=0;// 
a=0;//     .line 142
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/NetworkImageView$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onErrorResponse(Lcom/android/volley/VolleyError;)V
a=0;//     .locals 2
a=0;//     .param p1, "error"    # Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     invoke-static {v0}, Lcom/android/volley/toolbox/NetworkImageView;->access$0(Lcom/android/volley/toolbox/NetworkImageView;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     invoke-static {v1}, Lcom/android/volley/toolbox/NetworkImageView;->access$0(Lcom/android/volley/toolbox/NetworkImageView;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/NetworkImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResponse(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "response"    # Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;//     .param p2, "isImmediate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->val$isInLayoutPass:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     new-instance v1, Lcom/android/volley/toolbox/NetworkImageView$1$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/toolbox/NetworkImageView$1$1;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/android/volley/toolbox/NetworkImageView$1$1;-><init>(Lcom/android/volley/toolbox/NetworkImageView$1;Lcom/android/volley/toolbox/ImageLoader$ImageContainer;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/NetworkImageView$1$1;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/NetworkImageView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 166
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 168
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/android/volley/toolbox/NetworkImageView;->access$1(Lcom/android/volley/toolbox/NetworkImageView;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView$1;->this$0:Lcom/android/volley/toolbox/NetworkImageView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     invoke-static {v1}, Lcom/android/volley/toolbox/NetworkImageView;->access$1(Lcom/android/volley/toolbox/NetworkImageView;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/NetworkImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
