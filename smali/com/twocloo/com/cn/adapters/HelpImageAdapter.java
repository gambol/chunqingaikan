package com.twocloo.com.cn.adapters; class HelpImageAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/HelpImageAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "HelpImageAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private al:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/UseHelp;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field final inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/UseHelp;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     .local p2, "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/UseHelp;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/HelpImageAdapter;);
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/adapters/HelpImageAdapter;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 27
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/HelpImageAdapter;->al:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/HelpImageAdapter;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/HelpImageAdapter;->al:Ljava/util/ArrayList;
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
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/HelpImageAdapter;->al:Ljava/util/ArrayList;
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
a=0;//     .line 40
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 5
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 46
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/HelpImageAdapter;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$layout;->help_item:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v1, Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;);
a=0;//     invoke-direct {v1, v4}, Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;-><init>(Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;)V
a=0;// 
a=0;//     .line 48
a=0;//     .local v1, "holder":Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->help_title:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v2, v1, Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 49
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->help_image:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v2, v1, Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;->img:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/HelpImageAdapter;->al:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/UseHelp;
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "help":Lcom/twocloo/com/cn/beans/UseHelp;
a=0;//     iget-object v2, v1, Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/UseHelp;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v2, v1, Lcom/twocloo/com/cn/adapters/HelpImageAdapter$ViewHolder;->img:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/UseHelp;->getImg()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 59
a=0;//     return-object p2
a=0;// .end method
}}
