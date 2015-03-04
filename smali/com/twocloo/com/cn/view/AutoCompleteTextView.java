package com.twocloo.com.cn.view; class AutoCompleteTextView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// .super Landroid/widget/EditText;
a=0;// .source "AutoCompleteTextView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field context:Landroid/content/Context;
a=0;// 
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private isRLayout:Z
a=0;// 
a=0;// .field layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;// .field linearLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private mList:Ljava/util/ArrayList;
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
a=0;// .field memoryData:Ljava/util/ArrayList;
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
a=0;// .field public mlistView:Landroid/widget/ListView;
a=0;// 
a=0;// .field private myAdapter:Lcom/twocloo/com/cn/adapters/SearchAdapter;
a=0;// 
a=0;// .field myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;// .field private popView:Landroid/view/View;
a=0;// 
a=0;// .field relativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field watcher:Landroid/text/TextWatcher;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 37
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 34
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;-><init>(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->watcher:Landroid/text/TextWatcher;
a=0;// 
a=0;//     .line 161
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->memoryData:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 162
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     .line 163
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->popView:Landroid/view/View;
a=0;// 
a=0;//     .line 164
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mlistView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 165
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 168
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->relativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 169
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->linearLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 170
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->isRLayout:Z
a=0;// 
a=0;//     .line 38
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->setPopw()V
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->watcher:Landroid/text/TextWatcher;
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/TextWatcher;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/view/AutoCompleteTextView;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->getSimilarString(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Lcom/twocloo/com/cn/adapters/SearchAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myAdapter:Lcom/twocloo/com/cn/adapters/SearchAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/SearchAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->popView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->isRLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/view/AutoCompleteTextView;Lcom/twocloo/com/cn/db/DBAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getSimilarString(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
a=0;//     .locals 4
a=0;//     .param p1, "edt"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     .local p2, "datas":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 245
a=0;//     .local v1, "similars":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 246
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 252
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 246
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Boolean);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 247
a=0;//     .local v0, "s":Ljava/lang/String;
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private inflaterFooterView(Landroid/content/Context;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 228
a=0;//     .local v1, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->search_list_footer:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 229
a=0;//     .local v0, "footerview":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private setPopw()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->popView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->context:Landroid/content/Context;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->search_list:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v2, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->popView:Landroid/view/View;
a=0;// 
a=0;//     .line 177
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mlistView:Landroid/widget/ListView;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->popView:Landroid/view/View;
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->list_category:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/ListView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mlistView:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mlistView:Landroid/widget/ListView;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ListView;->setItemsCanFocus(Z)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mlistView:Landroid/widget/ListView;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;-><init>(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->inflaterFooterView(Landroid/content/Context;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 198
a=0;//     .local v0, "footer":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mlistView:Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 199
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->clear_histroy:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;-><init>(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 213
a=0;//     .end local v0    # "footer":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myAdapter:Lcom/twocloo/com/cn/adapters/SearchAdapter;
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 215
a=0;//     new-instance v1, Lcom/twocloo/com/cn/adapters/SearchAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/adapters/SearchAdapter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1, v2, v3}, Lcom/twocloo/com/cn/adapters/SearchAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/SearchAdapter;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myAdapter:Lcom/twocloo/com/cn/adapters/SearchAdapter;
a=0;// 
a=0;//     .line 217
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->mlistView:Landroid/widget/ListView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myAdapter:Lcom/twocloo/com/cn/adapters/SearchAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/SearchAdapter;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 218
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addMyTextWatcher(Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;)V
a=0;//     .locals 0
a=0;//     .param p1, "myTextWatcher"    # Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isListShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->popView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->isShown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public removeMyTextWatcher()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeTheShowView()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->popView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->isShown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->isRLayout:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->relativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->popView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->linearLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->popView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setFatherLinearLayout(Landroid/widget/LinearLayout;)V
a=0;//     .locals 1
a=0;//     .param p1, "layout"    # Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->linearLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 63
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->isRLayout:Z
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFatherRelativeLayouyt(Landroid/widget/RelativeLayout;)V
a=0;//     .locals 1
a=0;//     .param p1, "layout"    # Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->relativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->isRLayout:Z
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMemoryData(Ljava/util/ArrayList;)V
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
a=0;//     .line 72
a=0;//     .local p1, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->memoryData:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
}}
