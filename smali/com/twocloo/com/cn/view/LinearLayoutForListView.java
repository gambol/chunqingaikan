package com.twocloo.com.cn.view; class LinearLayoutForListView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/LinearLayoutForListView;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "LinearLayoutForListView.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private foodview:Landroid/view/View;
a=0;// 
a=0;// .field private headview:Landroid/view/View;
a=0;// 
a=0;// .field private onClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/LinearLayoutForListView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->onClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/LinearLayoutForListView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->onClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addFooterView(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->foodview:Landroid/view/View;
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addHeaderView(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->headview:Landroid/view/View;
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bindLinearLayout(Landroid/widget/BaseAdapter;)V
a=0;//     .locals 6
a=0;//     .param p1, "adapter"    # Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 21
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->removeAllViews()V
a=0;// 
a=0;//     .line 22
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->headview:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 23
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->headview:Landroid/view/View;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->addView(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 24
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/widget/BaseAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 25
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v1, v3, :cond_2
a=0;// 
a=0;//     .line 32
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->foodview:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->foodview:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 35
a=0;//     :cond_1
a=0;//     const-string v3, "countTAG"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// 
a=0;//     .line 27
a=0;//     :cond_2
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     add-int/lit8 v3, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {p1, v3, v5, v5}, Landroid/widget/BaseAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 29
a=0;//     .local v2, "v":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->onClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 30
a=0;//     invoke-virtual {p0, v2, v1}, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->addView(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 25
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getOnclickListner()Landroid/view/View$OnClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->onClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/BaseAdapter;)V
a=0;//     .locals 0
a=0;//     .param p1, "adpater"    # Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->bindLinearLayout(Landroid/widget/BaseAdapter;)V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnclickLinstener(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "onClickListener"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/LinearLayoutForListView;->onClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
}}
