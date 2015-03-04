package com.twocloo.com.cn.adapters; class ManageBookShelfAdapter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "ManageBookShelfAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;// .field dataChange:Z
a=0;// 
a=0;// .field private gridview:Landroid/widget/GridView;
a=0;// 
a=0;// .field private inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private myBookLists:Ljava/util/Vector;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private selectedMap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private updateaid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/activitys/ManageBookShelf;Ljava/util/Vector;Landroid/widget/GridView;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "ctx"    # Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;//     .param p3, "gridview"    # Landroid/widget/GridView;
a=0;//     .param p4, "updateAid"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/twocloo/com/cn/activitys/ManageBookShelf;",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;",
a=0;//             "Landroid/widget/GridView;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p2, "list":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 209
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;);
a=0;//     iput-boolean v4, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->dataChange:Z
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->context:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     .line 47
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->myBookLists:Ljava/util/Vector;
a=0;// 
a=0;//     .line 48
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->gridview:Landroid/widget/GridView;
a=0;// 
a=0;//     .line 49
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->updateaid:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->selectedMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->myBookLists:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->selectedMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->setSelectedMap(Ljava/util/HashMap;)V
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->selectedMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->myBookLists:Ljava/util/Vector;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 52
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->myBookLists:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "arg0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->myBookLists:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "arg0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedMap()Ljava/util/HashMap;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->selectedMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 10
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "arg2"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     #v9=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     .local v3, "holder":Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;//     #v3=(Null);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->myBookLists:Ljava/util/Vector;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v6, p1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 80
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;// 
a=0;//     .end local v3    # "holder":Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;);
a=0;//     invoke-direct {v3}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     .restart local v3    # "holder":Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->inflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$layout;->manage_bookshelf_item:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 83
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->coverlayout:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->bookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 84
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->bookname:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->bookName:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 85
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->unread:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->chapterCount:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 86
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->checkbox:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/CheckBox;
a=0;// 
a=0;//     iput-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->check:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 87
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->uncheckedcoverlayout:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->uncheckedbookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 88
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->item_id:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 92
a=0;//     :goto_0
a=0;//     #v7=(Conflicted);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->bookName:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->chapterCount:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getLastIndex()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 97
a=0;//     .local v5, "imgFile":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getBookDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->bookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getBookDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 141
a=0;//     .local v4, "id":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->selectedMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v7, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->check:Landroid/widget/CheckBox;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->selectedMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {v7, v6}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->uncheckedbookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 148
a=0;//     :goto_2
a=0;//     #v7=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     .line 90
a=0;//     .end local v4    # "id":I
a=0;//     .end local v5    # "imgFile":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Null);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->item_id:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p2, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "holder":Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;// 
a=0;//     .restart local v3    # "holder":Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     .restart local v5    # "imgFile":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v5=(Reference,Ljava/lang/String;);v6=(Reference,Landroid/graphics/drawable/Drawable;);v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v6, Ljava/io/File;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     :try_start_0
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->context:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     new-instance v7, Ljava/io/File;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v7}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 104
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     #v7=(Null);
a=0;//     invoke-static {v6, v7}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 105
a=0;//     .local v1, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setBookDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->bookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 111
a=0;//     .end local v1    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 112
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->bookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/LinearLayout;);
a=0;//     sget v7, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 109
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     .restart local v1    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);v2=(Uninit);v7=(Null);
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->bookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 118
a=0;//     .end local v1    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v6=(Boolean);v7=(Reference,Ljava/lang/String;);v8=(Null);
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->bookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/LinearLayout;);
a=0;//     sget v7, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 145
a=0;//     .restart local v4    # "id":I
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Integer);v7=(Reference,Ljava/lang/Integer;);v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->check:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v6, v3, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter$MyViewHolder;->uncheckedbookCover:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public notifyDataSetChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->dataChange:Z
a=0;// 
a=0;//     .line 201
a=0;//     invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public notifyDataSetChangedDefault()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->dataChange:Z
a=0;// 
a=0;//     .line 206
a=0;//     invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 207
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelectedMap(Ljava/util/HashMap;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     .local p1, "selectedMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Boolean;>;"
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->selectedMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
}}
