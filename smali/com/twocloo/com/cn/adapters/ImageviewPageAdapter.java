package com.twocloo.com.cn.adapters; class ImageviewPageAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/ImageviewPageAdapter;
a=0;// .super Landroid/support/v4/app/FragmentPagerAdapter;
a=0;// .source "ImageviewPageAdapter.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;//     .param p1, "fm"    # Landroid/support/v4/app/FragmentManager;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/app/FragmentManager;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/ImageviewPageAdapter;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/ImageviewPageAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ImageviewPageAdapter;->list:Ljava/util/ArrayList;
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
a=0;// .method public getItem(I)Landroid/support/v4/app/Fragment;
a=0;//     .locals 1
a=0;//     .param p1, "arg0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ImageviewPageAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
