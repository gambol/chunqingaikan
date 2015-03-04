package com.twocloo.com.cn.fragment; class MovieImageFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/MovieImageFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "MovieImageFragment.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "ValidFragment"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private url:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(ILandroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "url"    # I
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "ValidFragment"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/MovieImageFragment;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/MovieImageFragment;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 35
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/MovieImageFragment;->url:I
a=0;// 
a=0;//     .line 36
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/fragment/MovieImageFragment;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->movie_image:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 42
a=0;//     .local v1, "view":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->imageViewmovie:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 43
a=0;//     .local v0, "imageView":Landroid/widget/ImageView;
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/fragment/MovieImageFragment;->url:I
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 44
a=0;//     return-object v1
a=0;// .end method
}}
