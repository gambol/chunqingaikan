package com.twocloo.com.cn.adapters; class GalleryAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/GalleryAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "GalleryAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final LAYOUT_PARAMS:Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/base/cache/Cache",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field public context:Landroid/content/Context;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field public list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Image;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 27
a=0;//     #v1=(Byte);
a=0;//     new-instance v0, Landroid/widget/Gallery$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Gallery$LayoutParams;);
a=0;//     invoke-direct {v0, v1, v1}, Landroid/widget/Gallery$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Gallery$LayoutParams;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->LAYOUT_PARAMS:Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p3, "handler"    # Landroid/os/Handler;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Image;",
a=0;//             ">;",
a=0;//             "Landroid/os/Handler;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Image;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/GalleryAdapter;);
a=0;//     invoke-static {}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->getInstance()Lcom/twocloo/base/cache/view/ViewCacheProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/view/ViewCacheProvider;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 37
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 38
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 8
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     .line 55
a=0;//     #v6=(Byte);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 56
a=0;//     .local v3, "key":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "curView":Landroid/view/View;
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "holder":Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;
a=0;//     #v1=(Null);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     invoke-interface {v4, v3, v7}, Lcom/twocloo/base/cache/Cache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .end local v0    # "curView":Landroid/view/View;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 63
a=0;//     .restart local v0    # "curView":Landroid/view/View;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     .end local v0    # "curView":Landroid/view/View;
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 65
a=0;//     .restart local v0    # "curView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;
a=0;// 
a=0;//     .end local v1    # "holder":Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;);
a=0;//     invoke-direct {v1, v7}, Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;-><init>(Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;)V
a=0;// 
a=0;//     .restart local v1    # "holder":Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     .line 66
a=0;//     check-cast v4, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v4, v1, Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;->iv:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->VIEW_CACHE:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     invoke-interface {v4, v3, v0}, Lcom/twocloo/base/cache/Cache;->put(Ljava/lang/String;Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/Image;
a=0;// 
a=0;//     .line 77
a=0;//     .local v2, "img":Lcom/twocloo/com/cn/beans/Image;
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Image;->getImageURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v4, v1, Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;->iv:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget-object v5, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v4, v1, Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;->iv:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget-object v5, Lcom/twocloo/com/cn/adapters/GalleryAdapter;->LAYOUT_PARAMS:Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v4, v1, Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;->iv:Landroid/widget/ImageView;
a=0;// 
a=0;//     new-instance v5, Landroid/widget/Gallery$LayoutParams;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/Gallery$LayoutParams;);
a=0;//     invoke-direct {v5, v6, v6}, Landroid/widget/Gallery$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/Gallery$LayoutParams;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 81
a=0;//     const-string v4, "/2cloo/imgCache/"
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/base/http/LoadImgProvider;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Image;->getImageURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, v1, Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;->iv:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v4, v5, v6, v7}, Lcom/twocloo/base/http/LoadImgProvider;->load(Ljava/lang/String;Landroid/widget/ImageView;Z)V
a=0;// 
a=0;//     .line 87
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Boolean);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 73
a=0;//     .end local v2    # "img":Lcom/twocloo/com/cn/beans/Image;
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Uninit);v5=(Reference,Ljava/lang/String;);v6=(Byte);v7=(Null);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .end local v1    # "holder":Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;
a=0;// 
a=0;//     .restart local v1    # "holder":Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     .restart local v2    # "img":Lcom/twocloo/com/cn/beans/Image;
a=0;//     :cond_1
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Image;);
a=0;//     iget-object v4, v1, Lcom/twocloo/com/cn/adapters/GalleryAdapter$ViewHolder;->iv:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v5, Lcom/twocloo/com/cn/R$drawable;->download:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
