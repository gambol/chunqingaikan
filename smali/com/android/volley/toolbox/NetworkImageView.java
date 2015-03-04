package com.android.volley.toolbox; class NetworkImageView { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/NetworkImageView;
a=0;// .super Landroid/widget/ImageView;
a=0;// .source "NetworkImageView.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDefaultImageId:I
a=0;// 
a=0;// .field private mErrorImageId:I
a=0;// 
a=0;// .field private mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;// .field private mImageLoader:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;// .field private mUrl:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/NetworkImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/android/volley/toolbox/NetworkImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/NetworkImageView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/android/volley/toolbox/NetworkImageView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->mErrorImageId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/android/volley/toolbox/NetworkImageView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->mDefaultImageId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private loadImageIfNecessary(Z)V
a=0;//     .locals 7
a=0;//     .param p1, "isInLayoutPass"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 104
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 105
a=0;//     .local v3, "width":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 107
a=0;//     .local v0, "height":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 112
a=0;//     .local v1, "isFullyWrapContent":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v4=(Conflicted);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 176
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Reference,Lcom/android/volley/toolbox/NetworkImageView$1;);
a=0;//     return-void
a=0;// 
a=0;//     .line 107
a=0;//     .end local v1    # "isFullyWrapContent":Z
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(Byte);v6=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     .restart local v1    # "isFullyWrapContent":Z
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     iget-object v4, p0, Lcom/android/volley/toolbox/NetworkImageView;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v4, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v4, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->cancelRequest()V
a=0;// 
a=0;//     .line 121
a=0;//     iput-object v6, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     .line 123
a=0;//     :cond_3
a=0;//     invoke-virtual {p0, v6}, Lcom/android/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 128
a=0;//     :cond_4
a=0;//     #v4=(Boolean);
a=0;//     iget-object v4, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     iget-object v4, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->getRequestUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v4, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->getRequestUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/android/volley/toolbox/NetworkImageView;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v4, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     invoke-virtual {v4}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->cancelRequest()V
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {p0, v6}, Lcom/android/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 141
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageLoader:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/android/volley/toolbox/NetworkImageView;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 142
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/android/volley/toolbox/NetworkImageView$1;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/android/volley/toolbox/NetworkImageView$1;);
a=0;//     invoke-direct {v6, p0, p1}, Lcom/android/volley/toolbox/NetworkImageView$1;-><init>(Lcom/android/volley/toolbox/NetworkImageView;Z)V
a=0;// 
a=0;//     .line 141
a=0;//     #v6=(Reference,Lcom/android/volley/toolbox/NetworkImageView$1;);
a=0;//     invoke-virtual {v4, v5, v6}, Lcom/android/volley/toolbox/ImageLoader;->get(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$ImageListener;)Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 175
a=0;//     .local v2, "newContainer":Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;//     #v2=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     iput-object v2, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected drawableStateChanged()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V
a=0;// 
a=0;//     .line 200
a=0;//     invoke-virtual {p0}, Lcom/android/volley/toolbox/NetworkImageView;->invalidate()V
a=0;// 
a=0;//     .line 201
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 186
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->cancelRequest()V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {p0, v1}, Lcom/android/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 192
a=0;//     iput-object v1, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageContainer:Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     .line 194
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 1
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "right"    # I
a=0;//     .param p5, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 181
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/android/volley/toolbox/NetworkImageView;->loadImageIfNecessary(Z)V
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDefaultImageResId(I)V
a=0;//     .locals 0
a=0;//     .param p1, "defaultImage"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput p1, p0, Lcom/android/volley/toolbox/NetworkImageView;->mDefaultImageId:I
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setErrorImageResId(I)V
a=0;//     .locals 0
a=0;//     .param p1, "errorImage"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     iput p1, p0, Lcom/android/volley/toolbox/NetworkImageView;->mErrorImageId:I
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "imageLoader"    # Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/NetworkImageView;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 78
a=0;//     iput-object p2, p0, Lcom/android/volley/toolbox/NetworkImageView;->mImageLoader:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     .line 80
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/android/volley/toolbox/NetworkImageView;->loadImageIfNecessary(Z)V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
}}
