package com.android.volley.toolbox; class ImageLoader$1 { void a() { int a;
a=0;// .class Lcom/android/volley/toolbox/ImageLoader$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ImageLoader.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/android/volley/toolbox/ImageLoader;->getImageListener(Landroid/widget/ImageView;IIZ)Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic val$defaultImageResId:I
a=0;// 
a=0;// .field private final synthetic val$errorImageResId:I
a=0;// 
a=0;// .field private final synthetic val$view:Landroid/widget/ImageView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(ILandroid/widget/ImageView;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput p1, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$errorImageResId:I
a=0;// 
a=0;//     iput-object p2, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$view:Landroid/widget/ImageView;
a=0;// 
a=0;//     iput p3, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$defaultImageResId:I
a=0;// 
a=0;//     .line 104
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/ImageLoader$1;);
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
a=0;//     .line 107
a=0;//     iget v0, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$errorImageResId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$view:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget v1, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$errorImageResId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 110
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
a=0;//     .line 114
a=0;//     invoke-virtual {p1}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$view:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Uninit);
a=0;//     iget v0, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$defaultImageResId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$view:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget v1, p0, Lcom/android/volley/toolbox/ImageLoader$1;->val$defaultImageResId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
