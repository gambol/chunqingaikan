package com.twocloo.com.cn.adapters; class AdapterForOtherBook { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/AdapterForOtherBook;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "AdapterForOtherBook.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private datas:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/OtherBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/OtherBook;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     .local p2, "datas":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/OtherBook;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForOtherBook;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook;->datas:Ljava/util/ArrayList;
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
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook;->datas:Ljava/util/ArrayList;
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
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook;->datas:Ljava/util/ArrayList;
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
a=0;//     .line 43
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 6
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     #v5=(Null);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;);
a=0;//     invoke-direct {v1, v5}, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;-><init>(Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;)V
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "tag":Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v3}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$layout;->other_book_layout:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 51
a=0;//     .local v2, "view":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->title:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, v1, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 52
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->desc:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, v1, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;->description:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 53
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->totalwords:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, v1, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;->totalwords:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook;->datas:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/OtherBook;
a=0;// 
a=0;//     .line 55
a=0;//     .local v0, "otherbook":Lcom/twocloo/com/cn/beans/OtherBook;
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/OtherBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;->description:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 57
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/OtherBook;->getTotalview()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 56
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v3, v1, Lcom/twocloo/com/cn/adapters/AdapterForOtherBook$BookHolder;->totalwords:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/OtherBook;->getTotalwords()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 60
a=0;//     return-object v2
a=0;// .end method
}}
