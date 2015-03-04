package com.twocloo.com.cn.fragment; class SearchKeyWordsFragment$hotkeyWordsAdapter { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$hotkeyWordsAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "SearchKeyWordsFragment.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "hotkeyWordsAdapter"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$hotkeyWordsAdapter;->this$0:Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 63
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$hotkeyWordsAdapter;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$hotkeyWordsAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$hotkeyWordsAdapter;->list:Ljava/util/ArrayList;
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
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$hotkeyWordsAdapter;->list:Ljava/util/ArrayList;
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
a=0;//     .line 78
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
a=0;//     .line 83
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "view":Landroid/view/View;
a=0;//     #v1=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$hotkeyWordsAdapter;->this$0:Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$layout;->string_item:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 89
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/view/View;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 90
a=0;//     .local v0, "textView":Landroid/widget/TextView;
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/SearchKeyWordsFragment$hotkeyWordsAdapter;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 91
a=0;//     const v2, -0x737374
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 92
a=0;//     return-object v1
a=0;// 
a=0;//     .line 87
a=0;//     .end local v0    # "textView":Landroid/widget/TextView;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-object v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// .end method
}}
