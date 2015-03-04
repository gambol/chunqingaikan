package com.actionbarsherlock.widget; class SearchView { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/widget/SearchView;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "SearchView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/view/CollapsibleActionView;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;,
a=0;//         Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;,
a=0;//         Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;,
a=0;//         Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DBG:Z = false
a=0;// 
a=0;// .field private static final IME_OPTION_NO_MICROPHONE:Ljava/lang/String; = "nm"
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String; = "SearchView"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAppSearchData:Landroid/os/Bundle;
a=0;// 
a=0;// .field private mClearingFocus:Z
a=0;// 
a=0;// .field private mCloseButton:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private mCollapsedImeOptions:I
a=0;// 
a=0;// .field private mDropDownAnchor:Landroid/view/View;
a=0;// 
a=0;// .field private mExpandedInActionView:Z
a=0;// 
a=0;// .field private mIconified:Z
a=0;// 
a=0;// .field private mIconifiedByDefault:Z
a=0;// 
a=0;// .field private mMaxWidth:I
a=0;// 
a=0;// .field private mOldQueryText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private final mOnClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private mOnCloseListener:Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;
a=0;// 
a=0;// .field private final mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;
a=0;// 
a=0;// .field private final mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// .field private final mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;// .field private mOnQueryChangeListener:Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;
a=0;// 
a=0;// .field private mOnQueryTextFocusChangeListener:Landroid/view/View$OnFocusChangeListener;
a=0;// 
a=0;// .field private mOnSearchClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private mOnSuggestionListener:Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;
a=0;// 
a=0;// .field private final mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/WeakHashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/drawable/Drawable$ConstantState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mQueryHint:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mQueryRefinement:Z
a=0;// 
a=0;// .field private mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;// .field private mReleaseCursorRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mSearchButton:Landroid/view/View;
a=0;// 
a=0;// .field private mSearchEditFrame:Landroid/view/View;
a=0;// 
a=0;// .field private mSearchHintIcon:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private mSearchPlate:Landroid/view/View;
a=0;// 
a=0;// .field private mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;// .field private mShowImeRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mSubmitArea:Landroid/view/View;
a=0;// 
a=0;// .field private mSubmitButton:Landroid/view/View;
a=0;// 
a=0;// .field private mSubmitButtonEnabled:Z
a=0;// 
a=0;// .field private mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;// .field mTextKeyListener:Landroid/view/View$OnKeyListener;
a=0;// 
a=0;// .field private mTextWatcher:Landroid/text/TextWatcher;
a=0;// 
a=0;// .field private mUpdateDrawableStateRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mUserQuery:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private final mVoiceAppSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;// .field private mVoiceButton:Landroid/view/View;
a=0;// 
a=0;// .field private mVoiceButtonEnabled:Z
a=0;// 
a=0;// .field private final mVoiceWebSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 253
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 13
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v12, 0x10000000
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     .line 256
a=0;//     #v9=(Byte);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 150
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     new-instance v7, Lcom/actionbarsherlock/widget/SearchView$1;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$1;);
a=0;//     invoke-direct {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$1;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/widget/SearchView$1;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mShowImeRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 161
a=0;//     new-instance v7, Lcom/actionbarsherlock/widget/SearchView$2;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$2;);
a=0;//     invoke-direct {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$2;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/widget/SearchView$2;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mUpdateDrawableStateRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v7, Lcom/actionbarsherlock/widget/SearchView$3;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$3;);
a=0;//     invoke-direct {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$3;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/widget/SearchView$3;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mReleaseCursorRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 182
a=0;//     new-instance v7, Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v7}, Ljava/util/WeakHashMap;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/WeakHashMap;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     .line 875
a=0;//     new-instance v7, Lcom/actionbarsherlock/widget/SearchView$4;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$4;);
a=0;//     invoke-direct {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$4;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/widget/SearchView$4;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 924
a=0;//     new-instance v7, Lcom/actionbarsherlock/widget/SearchView$5;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$5;);
a=0;//     invoke-direct {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$5;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/widget/SearchView$5;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mTextKeyListener:Landroid/view/View$OnKeyListener;
a=0;// 
a=0;//     .line 1156
a=0;//     new-instance v7, Lcom/actionbarsherlock/widget/SearchView$6;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$6;);
a=0;//     invoke-direct {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$6;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/widget/SearchView$6;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;
a=0;// 
a=0;//     .line 1342
a=0;//     new-instance v7, Lcom/actionbarsherlock/widget/SearchView$7;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$7;);
a=0;//     invoke-direct {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$7;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/widget/SearchView$7;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     .line 1353
a=0;//     new-instance v7, Lcom/actionbarsherlock/widget/SearchView$8;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$8;);
a=0;//     invoke-direct {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$8;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/widget/SearchView$8;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     .line 1645
a=0;//     new-instance v7, Lcom/actionbarsherlock/widget/SearchView$9;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$9;);
a=0;//     invoke-direct {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$9;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/widget/SearchView$9;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mTextWatcher:Landroid/text/TextWatcher;
a=0;// 
a=0;//     .line 258
a=0;//     sget v7, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ge v7, v8, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     new-instance v7, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v8, "SearchView is API 8+ only."
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 263
a=0;//     :cond_0
a=0;//     #v7=(Integer);v8=(PosByte);
a=0;//     const-string v7, "layout_inflater"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 262
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 264
a=0;//     .local v3, "inflater":Landroid/view/LayoutInflater;
a=0;//     sget v7, Lcom/actionbarsherlock/R$layout;->abs__search_view:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v3, v7, p0, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     .line 266
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__search_button:I
a=0;// 
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchButton:Landroid/view/View;
a=0;// 
a=0;//     .line 267
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__search_src_text:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     invoke-virtual {v7, p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setSearchView(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     .line 270
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__search_edit_frame:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchEditFrame:Landroid/view/View;
a=0;// 
a=0;//     .line 271
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__search_plate:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchPlate:Landroid/view/View;
a=0;// 
a=0;//     .line 272
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__submit_area:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitArea:Landroid/view/View;
a=0;// 
a=0;//     .line 273
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__search_go_btn:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButton:Landroid/view/View;
a=0;// 
a=0;//     .line 274
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__search_close_btn:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 275
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__search_voice_btn:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButton:Landroid/view/View;
a=0;// 
a=0;//     .line 276
a=0;//     sget v7, Lcom/actionbarsherlock/R$id;->abs__search_mag_icon:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchHintIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchButton:Landroid/view/View;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 279
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButton:Landroid/view/View;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 281
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButton:Landroid/view/View;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mTextWatcher:Landroid/text/TextWatcher;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->addTextChangedListener(Landroid/text/TextWatcher;)V
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/widget/SearchView;->mTextKeyListener:Landroid/view/View$OnKeyListener;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     new-instance v8, Lcom/actionbarsherlock/widget/SearchView$10;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$10;);
a=0;//     invoke-direct {v8, p0}, Lcom/actionbarsherlock/widget/SearchView$10;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/widget/SearchView$10;);
a=0;//     invoke-virtual {v7, v8}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
a=0;// 
a=0;//     .line 299
a=0;//     sget-object v7, Lcom/actionbarsherlock/R$styleable;->SherlockSearchView:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v7, v10, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 300
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v0, v7, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->setIconifiedByDefault(Z)V
a=0;// 
a=0;//     .line 301
a=0;//     invoke-virtual {v0, v10, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 302
a=0;//     .local v5, "maxWidth":I
a=0;//     #v5=(Integer);
a=0;//     if-eq v5, v9, :cond_1
a=0;// 
a=0;//     .line 303
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/widget/SearchView;->setMaxWidth(I)V
a=0;// 
a=0;//     .line 305
a=0;//     :cond_1
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v0, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 306
a=0;//     .local v6, "queryHint":Ljava/lang/CharSequence;
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 307
a=0;//     invoke-virtual {p0, v6}, Lcom/actionbarsherlock/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 309
a=0;//     :cond_2
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v0, v7, v9}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 310
a=0;//     .local v2, "imeOptions":I
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, v9, :cond_3
a=0;// 
a=0;//     .line 311
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/widget/SearchView;->setImeOptions(I)V
a=0;// 
a=0;//     .line 313
a=0;//     :cond_3
a=0;//     invoke-virtual {v0, v11, v9}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 314
a=0;//     .local v4, "inputType":I
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, v9, :cond_4
a=0;// 
a=0;//     .line 315
a=0;//     invoke-virtual {p0, v4}, Lcom/actionbarsherlock/widget/SearchView;->setInputType(I)V
a=0;// 
a=0;//     .line 318
a=0;//     :cond_4
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 320
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 322
a=0;//     .local v1, "focusable":Z
a=0;//     #v1=(One);
a=0;//     sget-object v7, Lcom/actionbarsherlock/R$styleable;->SherlockView:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v7, v10, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 323
a=0;//     invoke-virtual {v0, v10, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 324
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 325
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/widget/SearchView;->setFocusable(Z)V
a=0;// 
a=0;//     .line 328
a=0;//     new-instance v7, Landroid/content/Intent;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v8, "android.speech.action.WEB_SEARCH"
a=0;// 
a=0;//     invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 329
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v7, v12}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v8, "android.speech.extra.LANGUAGE_MODEL"
a=0;// 
a=0;//     .line 331
a=0;//     const-string v9, "web_search"
a=0;// 
a=0;//     .line 330
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 333
a=0;//     new-instance v7, Landroid/content/Intent;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v8, "android.speech.action.RECOGNIZE_SPEECH"
a=0;// 
a=0;//     invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceAppSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceAppSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v7, v12}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getDropDownAnchor()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     iput-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mDropDownAnchor:Landroid/view/View;
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mDropDownAnchor:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 338
a=0;//     sget v7, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0xb
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-lt v7, v8, :cond_6
a=0;// 
a=0;//     .line 339
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mDropDownAnchor:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     new-instance v8, Lcom/actionbarsherlock/widget/SearchView$11;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$11;);
a=0;//     invoke-direct {v8, p0}, Lcom/actionbarsherlock/widget/SearchView$11;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/widget/SearchView$11;);
a=0;//     invoke-virtual {v7, v8}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V
a=0;// 
a=0;//     .line 355
a=0;//     :cond_5
a=0;//     :goto_0
a=0;//     iget-boolean v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconifiedByDefault:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     invoke-direct {p0, v7}, Lcom/actionbarsherlock/widget/SearchView;->updateViewsVisibility(Z)V
a=0;// 
a=0;//     .line 356
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateQueryHint()V
a=0;// 
a=0;//     .line 357
a=0;//     return-void
a=0;// 
a=0;//     .line 347
a=0;//     :cond_6
a=0;//     #v7=(Integer);v8=(PosByte);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/widget/SearchView;->mDropDownAnchor:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     new-instance v8, Lcom/actionbarsherlock/widget/SearchView$12;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/actionbarsherlock/widget/SearchView$12;);
a=0;//     invoke-direct {v8, p0}, Lcom/actionbarsherlock/widget/SearchView$12;-><init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/widget/SearchView$12;);
a=0;//     invoke-virtual {v7, v8}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Landroid/view/View;Landroid/view/inputmethod/InputMethodManager;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1790
a=0;//     invoke-static {p0, p1, p2}, Lcom/actionbarsherlock/widget/SearchView;->showSoftInputUnchecked(Landroid/view/View;Landroid/view/inputmethod/InputMethodManager;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 839
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateFocusedState()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1228
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->onVoiceClicked()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/actionbarsherlock/widget/SearchView;)Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1624
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->forceSuggestionQuery()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/actionbarsherlock/widget/SearchView;)Landroid/app/SearchableInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/SearchableInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/actionbarsherlock/widget/SearchView;Landroid/view/View;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 974
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/actionbarsherlock/widget/SearchView;->onSuggestionsKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/actionbarsherlock/widget/SearchView;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1447
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/actionbarsherlock/widget/SearchView;->launchQuerySearch(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/actionbarsherlock/widget/SearchView;IILjava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1322
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/actionbarsherlock/widget/SearchView;->onItemClicked(IILjava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$17(Lcom/actionbarsherlock/widget/SearchView;I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1333
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/SearchView;->onItemSelected(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$18(Lcom/actionbarsherlock/widget/SearchView;Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1167
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/SearchView;->onTextChanged(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$19(Landroid/widget/AutoCompleteTextView;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1780
a=0;//     invoke-static {p0, p1}, Lcom/actionbarsherlock/widget/SearchView;->ensureImeVisible(Landroid/widget/AutoCompleteTextView;Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/widget/SearchView;)Landroid/support/v4/widget/CursorAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$20(Lcom/actionbarsherlock/widget/SearchView;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 853
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/SearchView;->setImeVisibility(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$21(Lcom/actionbarsherlock/widget/SearchView;)Landroid/view/View$OnFocusChangeListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnQueryTextFocusChangeListener:Landroid/view/View$OnFocusChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View$OnFocusChangeListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$22(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1305
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->adjustDropDownSizeAndPosition()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/actionbarsherlock/widget/SearchView;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchButton:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1219
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->onSearchClicked()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/actionbarsherlock/widget/SearchView;)Landroid/widget/ImageView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1199
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->onCloseClicked()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/actionbarsherlock/widget/SearchView;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButton:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1181
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->onSubmitQuery()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/actionbarsherlock/widget/SearchView;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButton:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private adjustDropDownSizeAndPosition()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 1306
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mDropDownAnchor:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-le v4, v5, :cond_0
a=0;// 
a=0;//     .line 1307
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1308
a=0;//     .local v3, "res":Landroid/content/res/Resources;
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchPlate:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1309
a=0;//     .local v0, "anchorPadding":I
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 1310
a=0;//     .local v1, "dropDownPadding":Landroid/graphics/Rect;
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-boolean v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconifiedByDefault:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1311
a=0;//     sget v4, Lcom/actionbarsherlock/R$dimen;->abs__dropdownitem_icon_width:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1312
a=0;//     sget v5, Lcom/actionbarsherlock/R$dimen;->abs__dropdownitem_text_padding_left:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1311
a=0;//     add-int v2, v4, v5
a=0;// 
a=0;//     .line 1314
a=0;//     .local v2, "iconOffset":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getDropDownBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 1315
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget v5, v1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     add-int/2addr v5, v2
a=0;// 
a=0;//     neg-int v5, v5
a=0;// 
a=0;//     .line 1316
a=0;//     add-int/2addr v5, v0
a=0;// 
a=0;//     .line 1315
a=0;//     invoke-virtual {v4, v5}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setDropDownHorizontalOffset(I)V
a=0;// 
a=0;//     .line 1317
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/widget/SearchView;->mDropDownAnchor:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     .line 1318
a=0;//     iget v6, v1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     add-int/2addr v5, v2
a=0;// 
a=0;//     sub-int/2addr v5, v0
a=0;// 
a=0;//     .line 1317
a=0;//     invoke-virtual {v4, v5}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setDropDownWidth(I)V
a=0;// 
a=0;//     .line 1320
a=0;//     .end local v0    # "anchorPadding":I
a=0;//     .end local v1    # "dropDownPadding":Landroid/graphics/Rect;
a=0;//     .end local v2    # "iconOffset":I
a=0;//     .end local v3    # "res":Landroid/content/res/Resources;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1313
a=0;//     .restart local v0    # "anchorPadding":I
a=0;//     .restart local v1    # "dropDownPadding":Landroid/graphics/Rect;
a=0;//     .restart local v3    # "res":Landroid/content/res/Resources;
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Landroid/graphics/Rect;);v2=(Uninit);v3=(Reference,Landroid/content/res/Resources;);v4=(Boolean);v5=(One);v6=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private createIntent(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 3
a=0;//     .param p1, "action"    # Ljava/lang/String;
a=0;//     .param p2, "data"    # Landroid/net/Uri;
a=0;//     .param p3, "extraData"    # Ljava/lang/String;
a=0;//     .param p4, "query"    # Ljava/lang/String;
a=0;//     .param p5, "actionKey"    # I
a=0;//     .param p6, "actionMsg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1469
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1470
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1474
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 1475
a=0;//     invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1477
a=0;//     :cond_0
a=0;//     const-string v1, "user_query"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mUserQuery:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1478
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     .line 1479
a=0;//     const-string v1, "query"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1481
a=0;//     :cond_1
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     .line 1482
a=0;//     const-string v1, "intent_extra_data_key"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1484
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mAppSearchData:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1485
a=0;//     const-string v1, "app_data"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mAppSearchData:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1487
a=0;//     :cond_3
a=0;//     if-eqz p5, :cond_4
a=0;// 
a=0;//     .line 1488
a=0;//     const-string v1, "action_key"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1489
a=0;//     const-string v1, "action_msg"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1491
a=0;//     :cond_4
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1492
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createIntentFromSuggestion(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 12
a=0;//     .param p1, "c"    # Landroid/database/Cursor;
a=0;//     .param p2, "actionKey"    # I
a=0;//     .param p3, "actionMsg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1584
a=0;//     :try_start_0
a=0;//     const-string v0, "suggest_intent_action"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/actionbarsherlock/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1586
a=0;//     .local v1, "action":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1587
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestIntentAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1589
a=0;//     :cond_0
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1590
a=0;//     const-string v1, "android.intent.action.SEARCH"
a=0;// 
a=0;//     .line 1594
a=0;//     :cond_1
a=0;//     const-string v0, "suggest_intent_data"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/actionbarsherlock/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1595
a=0;//     .local v7, "data":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 1596
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestIntentData()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1599
a=0;//     :cond_2
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 1600
a=0;//     const-string v0, "suggest_intent_data_id"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/actionbarsherlock/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1601
a=0;//     .local v10, "id":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     .line 1602
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v10}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1605
a=0;//     .end local v10    # "id":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v10=(Conflicted);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1607
a=0;//     .local v2, "dataUri":Landroid/net/Uri;
a=0;//     :goto_0
a=0;//     #v2=(Reference,Landroid/net/Uri;);
a=0;//     const-string v0, "suggest_intent_query"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/actionbarsherlock/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1608
a=0;//     .local v4, "query":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "suggest_intent_extra_data"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/actionbarsherlock/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .local v3, "extraData":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move v5, p2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     .line 1610
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/actionbarsherlock/widget/SearchView;->createIntent(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1620
a=0;//     .end local v1    # "action":Ljava/lang/String;
a=0;//     .end local v2    # "dataUri":Landroid/net/Uri;
a=0;//     .end local v3    # "extraData":Ljava/lang/String;
a=0;//     .end local v4    # "query":Ljava/lang/String;
a=0;//     .end local v7    # "data":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1605
a=0;//     .restart local v1    # "action":Ljava/lang/String;
a=0;//     .restart local v7    # "data":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Reference,Ljava/lang/String;);v8=(Uninit);v9=(Uninit);v11=(Uninit);
a=0;//     invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/net/Uri;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1611
a=0;//     .end local v1    # "action":Ljava/lang/String;
a=0;//     .end local v7    # "data":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 1614
a=0;//     .local v8, "e":Ljava/lang/RuntimeException;
a=0;//     :try_start_1
a=0;//     #v8=(Reference,Ljava/lang/RuntimeException;);
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1618
a=0;//     .local v11, "rowNum":I
a=0;//     :goto_2
a=0;//     #v9=(Conflicted);v11=(Integer);
a=0;//     const-string v0, "SearchView"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Search suggestions cursor at row "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1619
a=0;//     const-string v6, " returned exception."
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1618
a=0;//     invoke-static {v0, v5, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 1620
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1615
a=0;//     .end local v11    # "rowNum":I
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Uninit);v11=(Uninit);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 1616
a=0;//     .local v9, "e2":Ljava/lang/RuntimeException;
a=0;//     #v9=(Reference,Ljava/lang/RuntimeException;);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     .restart local v11    # "rowNum":I
a=0;//     #v11=(Byte);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private createVoiceAppSearchIntent(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
a=0;//     .locals 13
a=0;//     .param p1, "baseIntent"    # Landroid/content/Intent;
a=0;//     .param p2, "searchable"    # Landroid/app/SearchableInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1514
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1519
a=0;//     .local v8, "searchActivity":Landroid/content/ComponentName;
a=0;//     #v8=(Reference,Landroid/content/ComponentName;);
a=0;//     new-instance v6, Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v10, "android.intent.action.SEARCH"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1520
a=0;//     .local v6, "queryIntent":Landroid/content/Intent;
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v6, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1521
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1522
a=0;//     #v11=(Null);
a=0;//     const/high16 v12, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 1521
a=0;//     #v12=(Integer);
a=0;//     invoke-static {v10, v11, v6, v12}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1528
a=0;//     .local v3, "pending":Landroid/app/PendingIntent;
a=0;//     #v3=(Reference,Landroid/app/PendingIntent;);
a=0;//     new-instance v5, Landroid/os/Bundle;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v5}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 1533
a=0;//     .local v5, "queryExtras":Landroid/os/Bundle;
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v9, Landroid/content/Intent;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v9, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1536
a=0;//     .local v9, "voiceIntent":Landroid/content/Intent;
a=0;//     #v9=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "free_form"
a=0;// 
a=0;//     .line 1537
a=0;//     .local v1, "languageModel":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1538
a=0;//     .local v4, "prompt":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1539
a=0;//     .local v0, "language":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1541
a=0;//     .local v2, "maxResults":I
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1542
a=0;//     .local v7, "resources":Landroid/content/res/Resources;
a=0;//     #v7=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 1543
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1545
a=0;//     :cond_0
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 1546
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1548
a=0;//     :cond_1
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 1549
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1551
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     .line 1552
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1554
a=0;//     :cond_3
a=0;//     #v2=(Integer);
a=0;//     const-string v10, "android.speech.extra.LANGUAGE_MODEL"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1555
a=0;//     const-string v10, "android.speech.extra.PROMPT"
a=0;// 
a=0;//     invoke-virtual {v9, v10, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1556
a=0;//     const-string v10, "android.speech.extra.LANGUAGE"
a=0;// 
a=0;//     invoke-virtual {v9, v10, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1557
a=0;//     const-string v10, "android.speech.extra.MAX_RESULTS"
a=0;// 
a=0;//     invoke-virtual {v9, v10, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1558
a=0;//     const-string v11, "calling_package"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     if-nez v8, :cond_4
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v9, v11, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1562
a=0;//     const-string v10, "android.speech.extra.RESULTS_PENDINGINTENT"
a=0;// 
a=0;//     invoke-virtual {v9, v10, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1563
a=0;//     const-string v10, "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
a=0;// 
a=0;//     invoke-virtual {v9, v10, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1565
a=0;//     return-object v9
a=0;// 
a=0;//     .line 1559
a=0;//     :cond_4
a=0;//     invoke-virtual {v8}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private createVoiceWebSearchIntent(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
a=0;//     .locals 4
a=0;//     .param p1, "baseIntent"    # Landroid/content/Intent;
a=0;//     .param p2, "searchable"    # Landroid/app/SearchableInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1499
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1500
a=0;//     .local v1, "voiceIntent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1501
a=0;//     .local v0, "searchActivity":Landroid/content/ComponentName;
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     const-string v3, "calling_package"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1503
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1502
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private dismissSuggestions()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1196
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->dismissDropDown()V
a=0;// 
a=0;//     .line 1197
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static ensureImeVisible(Landroid/widget/AutoCompleteTextView;Z)V
a=0;//     .locals 6
a=0;//     .param p0, "view"    # Landroid/widget/AutoCompleteTextView;
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1782
a=0;//     :try_start_0
a=0;//     const-class v1, Landroid/widget/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     const-string v2, "ensureImeVisible"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1783
a=0;//     .local v0, "method":Ljava/lang/reflect/Method;
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 1784
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1788
a=0;//     .end local v0    # "method":Ljava/lang/reflect/Method;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1785
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private forceSuggestionQuery()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 1626
a=0;//     :try_start_0
a=0;//     const-class v2, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     const-string v3, "doBeforeTextChanged"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1627
a=0;//     .local v1, "before":Ljava/lang/reflect/Method;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const-class v2, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     const-string v3, "doAfterTextChanged"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1628
a=0;//     .local v0, "after":Ljava/lang/reflect/Method;
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 1629
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 1630
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1631
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1635
a=0;//     .end local v0    # "after":Ljava/lang/reflect/Method;
a=0;//     .end local v1    # "before":Ljava/lang/reflect/Method;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1632
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getDecoratedHint(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
a=0;//     .locals 8
a=0;//     .param p1, "hintText"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1072
a=0;//     #v7=(Null);
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconifiedByDefault:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 1080
a=0;//     .end local p1    # "hintText":Ljava/lang/CharSequence;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 1074
a=0;//     .restart local p1    # "hintText":Ljava/lang/CharSequence;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v1, Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/text/SpannableStringBuilder;);
a=0;//     const-string v3, "   "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1075
a=0;//     .local v1, "ssb":Landroid/text/SpannableStringBuilder;
a=0;//     #v1=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     .line 1076
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->getSearchIconId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1077
a=0;//     .local v0, "searchIcon":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getTextSize()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const-wide/high16 v5, 0x3ff4000000000000L    # 1.25
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     mul-double/2addr v3, v5
a=0;// 
a=0;//     double-to-int v2, v3
a=0;// 
a=0;//     .line 1078
a=0;//     .local v2, "textSize":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v7, v7, v2, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 1079
a=0;//     new-instance v3, Landroid/text/style/ImageSpan;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/style/ImageSpan;);
a=0;//     invoke-direct {v3, v0}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/style/ImageSpan;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/16 v6, 0x21
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v1, v3, v4, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     move-object p1, v1
a=0;// 
a=0;//     .line 1080
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getPreferredWidth()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 766
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 767
a=0;//     sget v1, Lcom/actionbarsherlock/R$dimen;->abs__search_view_preferred_width:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 766
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getSearchIconId()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1064
a=0;//     new-instance v0, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 1065
a=0;//     .local v0, "outValue":Landroid/util/TypedValue;
a=0;//     #v0=(Reference,Landroid/util/TypedValue;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/actionbarsherlock/R$attr;->searchViewSearchIcon:I
a=0;// 
a=0;//     .line 1066
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 1065
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
a=0;// 
a=0;//     .line 1067
a=0;//     iget v1, v0, Landroid/util/TypedValue;->resourceId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method private hasVoiceSearch()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 787
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/SearchableInfo;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 788
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 789
a=0;//     .local v1, "testIntent":Landroid/content/Intent;
a=0;//     #v1=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/SearchableInfo;);
a=0;//     invoke-virtual {v3}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 790
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 794
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 795
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 796
a=0;//     const/high16 v4, 0x10000
a=0;// 
a=0;//     .line 795
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v1, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 797
a=0;//     .local v0, "ri":Landroid/content/pm/ResolveInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 800
a=0;//     .end local v0    # "ri":Landroid/content/pm/ResolveInfo;
a=0;//     .end local v1    # "testIntent":Landroid/content/Intent;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 791
a=0;//     .restart local v1    # "testIntent":Landroid/content/Intent;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Null);v2=(Null);v3=(Boolean);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/SearchableInfo;);
a=0;//     invoke-virtual {v3}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 792
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceAppSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static isLandscapeMode(Landroid/content/Context;)Z
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1638
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     .line 1639
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 1638
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isSubmitAreaEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 804
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButtonEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButtonEnabled:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->isIconified()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private launchIntent(Landroid/content/Intent;)V
a=0;//     .locals 4
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1426
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 1436
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1432
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1433
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1434
a=0;//     .local v0, "ex":Ljava/lang/RuntimeException;
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "SearchView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Failed launch activity: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private launchQuerySearch(ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "actionKey"    # I
a=0;//     .param p2, "actionMsg"    # Ljava/lang/String;
a=0;//     .param p3, "query"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1448
a=0;//     #v2=(Null);
a=0;//     const-string v1, "android.intent.action.SEARCH"
a=0;// 
a=0;//     .local v1, "action":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v6, p2
a=0;// 
a=0;//     .line 1449
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/actionbarsherlock/widget/SearchView;->createIntent(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1450
a=0;//     .local v7, "intent":Landroid/content/Intent;
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1451
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private launchSuggestion(IILjava/lang/String;)Z
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "actionKey"    # I
a=0;//     .param p3, "actionMsg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1409
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/CursorAdapter;->getCursor()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1410
a=0;//     .local v0, "c":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1412
a=0;//     invoke-direct {p0, v0, p2, p3}, Lcom/actionbarsherlock/widget/SearchView;->createIntentFromSuggestion(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1415
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-direct {p0, v1}, Lcom/actionbarsherlock/widget/SearchView;->launchIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1417
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1419
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onCloseClicked()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 1200
a=0;//     #v3=(One);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1201
a=0;//     .local v0, "text":Ljava/lang/CharSequence;
a=0;//     #v0=(Reference,Landroid/text/Editable;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1202
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconifiedByDefault:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1204
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnCloseListener:Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnCloseListener:Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;->onClose()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1206
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->clearFocus()V
a=0;// 
a=0;//     .line 1208
a=0;//     invoke-direct {p0, v3}, Lcom/actionbarsherlock/widget/SearchView;->updateViewsVisibility(Z)V
a=0;// 
a=0;//     .line 1217
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1212
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1213
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->requestFocus()Z
a=0;// 
a=0;//     .line 1214
a=0;//     invoke-direct {p0, v3}, Lcom/actionbarsherlock/widget/SearchView;->setImeVisibility(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onItemClicked(IILjava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "actionKey"    # I
a=0;//     .param p3, "actionMsg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1323
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnSuggestionListener:Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1324
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnSuggestionListener:Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;->onSuggestionClick(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1325
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/actionbarsherlock/widget/SearchView;->launchSuggestion(IILjava/lang/String;)Z
a=0;// 
a=0;//     .line 1326
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->setImeVisibility(Z)V
a=0;// 
a=0;//     .line 1327
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->dismissSuggestions()V
a=0;// 
a=0;//     .line 1328
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1330
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private onItemSelected(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1334
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnSuggestionListener:Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1335
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnSuggestionListener:Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;->onSuggestionSelect(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1336
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/SearchView;->rewriteQueryFromSuggestion(I)V
a=0;// 
a=0;//     .line 1337
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1339
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onSearchClicked()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1220
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->updateViewsVisibility(Z)V
a=0;// 
a=0;//     .line 1221
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->requestFocus()Z
a=0;// 
a=0;//     .line 1222
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->setImeVisibility(Z)V
a=0;// 
a=0;//     .line 1223
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnSearchClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1224
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnSearchClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1226
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private onSubmitQuery()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1182
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1183
a=0;//     .local v0, "query":Ljava/lang/CharSequence;
a=0;//     #v0=(Reference,Landroid/text/Editable;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 1184
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnQueryChangeListener:Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1185
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnQueryChangeListener:Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2}, Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;->onQueryTextSubmit(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 1186
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/SearchableInfo;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1187
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3, v1, v2}, Lcom/actionbarsherlock/widget/SearchView;->launchQuerySearch(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1188
a=0;//     invoke-direct {p0, v3}, Lcom/actionbarsherlock/widget/SearchView;->setImeVisibility(Z)V
a=0;// 
a=0;//     .line 1190
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/app/SearchableInfo;);v2=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->dismissSuggestions()V
a=0;// 
a=0;//     .line 1193
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private onSuggestionsKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "keyCode"    # I
a=0;//     .param p3, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x15
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 976
a=0;//     #v2=(Null);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/SearchableInfo;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 1033
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Integer);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 979
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(One);v4=(Reference,Landroid/app/SearchableInfo;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 982
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     invoke-static {p3}, Landroid/support/v4/view/KeyEventCompat;->hasNoModifiers(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 985
a=0;//     const/16 v4, 0x42
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq p2, v4, :cond_2
a=0;// 
a=0;//     const/16 v4, 0x54
a=0;// 
a=0;//     if-eq p2, v4, :cond_2
a=0;// 
a=0;//     .line 986
a=0;//     const/16 v4, 0x3d
a=0;// 
a=0;//     if-ne p2, v4, :cond_3
a=0;// 
a=0;//     .line 987
a=0;//     :cond_2
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getListSelection()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 988
a=0;//     .local v0, "position":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0, v0, v2, v3}, Lcom/actionbarsherlock/widget/SearchView;->onItemClicked(IILjava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 993
a=0;//     .end local v0    # "position":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Null);v3=(One);
a=0;//     if-eq p2, v5, :cond_4
a=0;// 
a=0;//     const/16 v4, 0x16
a=0;// 
a=0;//     if-ne p2, v4, :cond_6
a=0;// 
a=0;//     .line 998
a=0;//     :cond_4
a=0;//     if-ne p2, v5, :cond_5
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 1000
a=0;//     .local v1, "selPoint":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v4, v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setSelection(I)V
a=0;// 
a=0;//     .line 1001
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setListSelection(I)V
a=0;// 
a=0;//     .line 1002
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->clearListSelection()V
a=0;// 
a=0;//     .line 1003
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/actionbarsherlock/widget/SearchView;->ensureImeVisible(Landroid/widget/AutoCompleteTextView;Z)V
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 1005
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 998
a=0;//     .end local v1    # "selPoint":I
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(Null);v4=(PosByte);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     .line 999
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1009
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v4=(PosByte);
a=0;//     const/16 v3, 0x13
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne p2, v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getListSelection()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onTextChanged(Ljava/lang/CharSequence;)V
a=0;//     .locals 5
a=0;//     .param p1, "newText"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1168
a=0;//     #v2=(Null);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1169
a=0;//     .local v1, "text":Ljava/lang/CharSequence;
a=0;//     #v1=(Reference,Landroid/text/Editable;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mUserQuery:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 1170
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 1171
a=0;//     .local v0, "hasText":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->updateSubmitButton(Z)V
a=0;// 
a=0;//     .line 1172
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-direct {p0, v2}, Lcom/actionbarsherlock/widget/SearchView;->updateVoiceButton(Z)V
a=0;// 
a=0;//     .line 1173
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateCloseButton()V
a=0;// 
a=0;//     .line 1174
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateSubmitArea()V
a=0;// 
a=0;//     .line 1175
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnQueryChangeListener:Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mOldQueryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1176
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnQueryChangeListener:Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;);
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3}, Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;->onQueryTextChange(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 1178
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mOldQueryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 1179
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "hasText":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Null);v3=(One);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 1170
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v0    # "hasText":Z
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 1172
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private onVoiceClicked()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 1230
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/SearchableInfo;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 1249
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1233
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Landroid/app/SearchableInfo;);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     .line 1235
a=0;//     .local v2, "searchable":Landroid/app/SearchableInfo;
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/app/SearchableInfo;);
a=0;//     invoke-virtual {v2}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 1236
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     invoke-direct {p0, v4, v2}, Lcom/actionbarsherlock/widget/SearchView;->createVoiceWebSearchIntent(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1238
a=0;//     .local v3, "webSearchIntent":Landroid/content/Intent;
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1244
a=0;//     .end local v3    # "webSearchIntent":Landroid/content/Intent;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 1247
a=0;//     .local v1, "e":Landroid/content/ActivityNotFoundException;
a=0;//     #v1=(Reference,Landroid/content/ActivityNotFoundException;);
a=0;//     const-string v4, "SearchView"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "Could not find voice search activity"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1239
a=0;//     .end local v1    # "e":Landroid/content/ActivityNotFoundException;
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);
a=0;//     invoke-virtual {v2}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1240
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceAppSearchIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     invoke-direct {p0, v4, v2}, Lcom/actionbarsherlock/widget/SearchView;->createVoiceAppSearchIntent(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1242
a=0;//     .local v0, "appSearchIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_1
a=0;//     .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private postUpdateFocusedState()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 836
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mUpdateDrawableStateRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 837
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private rewriteQueryFromSuggestion(I)V
a=0;//     .locals 4
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1376
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1377
a=0;//     .local v2, "oldQuery":Ljava/lang/CharSequence;
a=0;//     #v2=(Reference,Landroid/text/Editable;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/widget/CursorAdapter;->getCursor()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1378
a=0;//     .local v0, "c":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1396
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1381
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v3=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 1383
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     invoke-virtual {v3, v0}, Landroid/support/v4/widget/CursorAdapter;->convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1384
a=0;//     .local v1, "newQuery":Ljava/lang/CharSequence;
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1387
a=0;//     invoke-direct {p0, v1}, Lcom/actionbarsherlock/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1390
a=0;//     :cond_1
a=0;//     invoke-direct {p0, v2}, Lcom/actionbarsherlock/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1394
a=0;//     .end local v1    # "newQuery":Ljava/lang/CharSequence;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v3=(Boolean);
a=0;//     invoke-direct {p0, v2}, Lcom/actionbarsherlock/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setImeVisibility(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 854
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 855
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mShowImeRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/widget/SearchView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 865
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 857
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mShowImeRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/widget/SearchView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 859
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "input_method"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 858
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/inputmethod/InputMethodManager;
a=0;// 
a=0;//     .line 861
a=0;//     .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 862
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setQuery(Ljava/lang/CharSequence;)V
a=0;//     .locals 2
a=0;//     .param p1, "query"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1442
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, p1, v1}, Lcom/actionbarsherlock/widget/SearchView;->setText(Landroid/widget/AutoCompleteTextView;Ljava/lang/CharSequence;Z)V
a=0;// 
a=0;//     .line 1444
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setSelection(I)V
a=0;// 
a=0;//     .line 1445
a=0;//     return-void
a=0;// 
a=0;//     .line 1444
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static setText(Landroid/widget/AutoCompleteTextView;Ljava/lang/CharSequence;Z)V
a=0;//     .locals 7
a=0;//     .param p0, "view"    # Landroid/widget/AutoCompleteTextView;
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "filter"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1803
a=0;//     :try_start_0
a=0;//     const-class v2, Landroid/widget/AutoCompleteTextView;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     const-string v3, "setText"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-class v6, Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1804
a=0;//     .local v1, "method":Ljava/lang/reflect/Method;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 1805
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1810
a=0;//     .end local v1    # "method":Ljava/lang/reflect/Method;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1806
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1808
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static showSoftInputUnchecked(Landroid/view/View;Landroid/view/inputmethod/InputMethodManager;I)V
a=0;//     .locals 7
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "imm"    # Landroid/view/inputmethod/InputMethodManager;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1792
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     const-string v3, "showSoftInputUnchecked"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const-class v6, Landroid/os/ResultReceiver;
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1793
a=0;//     .local v1, "method":Ljava/lang/reflect/Method;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 1794
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1799
a=0;//     .end local v1    # "method":Ljava/lang/reflect/Method;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1795
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1797
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {p1, p0, p2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateCloseButton()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 827
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 830
a=0;//     .local v0, "hasText":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconifiedByDefault:Z
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mExpandedInActionView:Z
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 831
a=0;//     .local v1, "showClose":Z
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 832
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     sget-object v2, Lcom/actionbarsherlock/widget/SearchView;->ENABLED_STATE_SET:[I
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v3, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 833
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "hasText":Z
a=0;//     .end local v1    # "showClose":Z
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(One);v2=(Null);v3=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 827
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 831
a=0;//     .restart local v0    # "hasText":Z
a=0;//     .restart local v1    # "showClose":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Boolean);v3=(Reference,Landroid/widget/ImageView;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 832
a=0;//     :cond_4
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     sget-object v2, Lcom/actionbarsherlock/widget/SearchView;->EMPTY_STATE_SET:[I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private updateFocusedState()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 840
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->hasFocus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 841
a=0;//     .local v0, "focused":Z
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchPlate:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v1, Lcom/actionbarsherlock/widget/SearchView;->FOCUSED_STATE_SET:[I
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 842
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitArea:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v1, Lcom/actionbarsherlock/widget/SearchView;->FOCUSED_STATE_SET:[I
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 843
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->invalidate()V
a=0;// 
a=0;//     .line 844
a=0;//     return-void
a=0;// 
a=0;//     .line 841
a=0;//     :cond_0
a=0;//     sget-object v1, Lcom/actionbarsherlock/widget/SearchView;->EMPTY_STATE_SET:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 842
a=0;//     :cond_1
a=0;//     sget-object v1, Lcom/actionbarsherlock/widget/SearchView;->EMPTY_STATE_SET:[I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private updateQueryHint()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1084
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1085
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-direct {p0, v3}, Lcom/actionbarsherlock/widget/SearchView;->getDecoratedHint(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1098
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1086
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 1087
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1088
a=0;//     .local v0, "hint":Ljava/lang/CharSequence;
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/SearchableInfo;->getHintId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1089
a=0;//     .local v1, "hintId":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1090
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1092
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1093
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->getDecoratedHint(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1096
a=0;//     .end local v0    # "hint":Ljava/lang/CharSequence;
a=0;//     .end local v1    # "hintId":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/actionbarsherlock/widget/SearchView;->getDecoratedHint(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateSearchAutoComplete()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1105
a=0;//     #v2=(One);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/SearchableInfo;);
a=0;//     invoke-virtual {v3}, Landroid/app/SearchableInfo;->getSuggestThreshold()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setThreshold(I)V
a=0;// 
a=0;//     .line 1106
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/SearchableInfo;);
a=0;//     invoke-virtual {v3}, Landroid/app/SearchableInfo;->getImeOptions()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V
a=0;// 
a=0;//     .line 1107
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/SearchableInfo;->getInputType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1110
a=0;//     .local v0, "inputType":I
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, 0xf
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 1113
a=0;//     const v1, -0x10001
a=0;// 
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     .line 1114
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/SearchableInfo;);
a=0;//     invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1115
a=0;//     const/high16 v1, 0x10000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 1122
a=0;//     const/high16 v1, 0x80000
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 1125
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setInputType(I)V
a=0;// 
a=0;//     .line 1126
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1127
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v4/widget/CursorAdapter;->changeCursor(Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 1131
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1132
a=0;//     new-instance v1, Lcom/actionbarsherlock/widget/SuggestionsAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/widget/SuggestionsAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1133
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/SearchableInfo;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/widget/SearchView;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v1, v3, p0, v4, v5}, Lcom/actionbarsherlock/widget/SuggestionsAdapter;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V
a=0;// 
a=0;//     .line 1132
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SuggestionsAdapter;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     .line 1134
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 1135
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     check-cast v1, Lcom/actionbarsherlock/widget/SuggestionsAdapter;
a=0;// 
a=0;//     .line 1136
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryRefinement:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 1135
a=0;//     :cond_2
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/widget/SuggestionsAdapter;->setQueryRefinement(I)V
a=0;// 
a=0;//     .line 1139
a=0;//     :cond_3
a=0;//     #v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateSubmitArea()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 817
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     .line 818
a=0;//     .local v0, "visibility":I
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->isSubmitAreaEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 819
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButton:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 820
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButton:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 821
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 823
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitArea:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 824
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateSubmitButton(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "hasText"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 808
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     .line 809
a=0;//     .local v0, "visibility":I
a=0;//     #v0=(PosByte);
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButtonEnabled:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->isSubmitAreaEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->hasFocus()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 810
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButtonEnabled:Z
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 811
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 813
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButton:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 814
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateViewsVisibility(Z)V
a=0;//     .locals 7
a=0;//     .param p1, "collapsed"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 771
a=0;//     #v2=(Null);
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconified:Z
a=0;// 
a=0;//     .line 773
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 775
a=0;//     .local v1, "visCollapsed":I
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 777
a=0;//     .local v0, "hasText":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchButton:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 778
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->updateSubmitButton(Z)V
a=0;// 
a=0;//     .line 779
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchEditFrame:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     move v5, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 780
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchHintIcon:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-boolean v6, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconifiedByDefault:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 781
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateCloseButton()V
a=0;// 
a=0;//     .line 782
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Boolean);
a=0;//     invoke-direct {p0, v2}, Lcom/actionbarsherlock/widget/SearchView;->updateVoiceButton(Z)V
a=0;// 
a=0;//     .line 783
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateSubmitArea()V
a=0;// 
a=0;//     .line 784
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "hasText":Z
a=0;//     .end local v1    # "visCollapsed":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 773
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "visCollapsed":I
a=0;//     :cond_1
a=0;//     #v5=(Boolean);
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 775
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v0    # "hasText":Z
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v5=(Reference,Landroid/view/View;);v6=(Reference,Landroid/view/View;);
a=0;//     move v5, v2
a=0;// 
a=0;//     .line 779
a=0;//     #v5=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Reference,Landroid/widget/ImageView;);v6=(Boolean);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 780
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(PosByte);
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 782
a=0;//     #v2=(One);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method private updateVoiceButton(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "empty"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1148
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     .line 1149
a=0;//     .local v0, "visibility":I
a=0;//     #v0=(PosByte);
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButtonEnabled:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->isIconified()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 1150
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1151
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButton:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 1153
a=0;//     :cond_0
a=0;//     #v0=(PosByte);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButton:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 1154
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clearFocus()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 460
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mClearingFocus:Z
a=0;// 
a=0;//     .line 461
a=0;//     invoke-direct {p0, v1}, Lcom/actionbarsherlock/widget/SearchView;->setImeVisibility(Z)V
a=0;// 
a=0;//     .line 462
a=0;//     invoke-super {p0}, Landroid/widget/LinearLayout;->clearFocus()V
a=0;// 
a=0;//     .line 463
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->clearFocus()V
a=0;// 
a=0;//     .line 464
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mClearingFocus:Z
a=0;// 
a=0;//     .line 465
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getImeOptions()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 413
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getImeOptions()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getInputType()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getInputType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMaxWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     iget v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mMaxWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getQuery()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getQueryHint()Ljava/lang/CharSequence;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 566
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 567
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 576
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 568
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 569
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 570
a=0;//     .local v0, "hint":Ljava/lang/CharSequence;
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/SearchableInfo;->getHintId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 571
a=0;//     .local v1, "hintId":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 572
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 576
a=0;//     .end local v0    # "hint":Ljava/lang/CharSequence;
a=0;//     .end local v1    # "hintId":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSuggestionsAdapter()Landroid/support/v4/widget/CursorAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 705
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isIconfiedByDefault()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 605
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconifiedByDefault:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isIconified()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 633
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconified:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isQueryRefinementEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 685
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryRefinement:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isSubmitButtonEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 655
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButtonEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onActionViewCollapsed()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1273
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->clearFocus()V
a=0;// 
a=0;//     .line 1274
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->updateViewsVisibility(Z)V
a=0;// 
a=0;//     .line 1275
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mCollapsedImeOptions:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V
a=0;// 
a=0;//     .line 1276
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mExpandedInActionView:Z
a=0;// 
a=0;//     .line 1277
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActionViewExpanded()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1284
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mExpandedInActionView:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1291
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1286
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mExpandedInActionView:Z
a=0;// 
a=0;//     .line 1287
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getImeOptions()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mCollapsedImeOptions:I
a=0;// 
a=0;//     .line 1288
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mCollapsedImeOptions:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0x2000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V
a=0;// 
a=0;//     .line 1289
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1290
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->setIconified(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 848
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mUpdateDrawableStateRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 849
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mReleaseCursorRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 850
a=0;//     invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 851
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1295
a=0;//     invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 1296
a=0;//     const-class v0, Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1297
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
a=0;//     .locals 1
a=0;//     .param p1, "info"    # Landroid/view/accessibility/AccessibilityNodeInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1301
a=0;//     invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
a=0;// 
a=0;//     .line 1302
a=0;//     const-class v0, Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1303
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 903
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/SearchableInfo;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 904
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 916
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/app/SearchableInfo;);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 3
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 733
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->isIconified()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 734
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 763
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 738
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 739
a=0;//     .local v1, "widthMode":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 741
a=0;//     .local v0, "width":I
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 761
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Integer);
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 762
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-super {p0, v2, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 744
a=0;//     :sswitch_0
a=0;//     #v2=(Boolean);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mMaxWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     .line 745
a=0;//     iget v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mMaxWidth:I
a=0;// 
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 746
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 747
a=0;//     :cond_2
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->getPreferredWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 749
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 752
a=0;//     :sswitch_1
a=0;//     #v2=(Boolean);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mMaxWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 753
a=0;//     iget v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mMaxWidth:I
a=0;// 
a=0;//     invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 755
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 758
a=0;//     :sswitch_2
a=0;//     #v2=(Boolean);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mMaxWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_3
a=0;// 
a=0;//     iget v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mMaxWidth:I
a=0;// 
a=0;//     :goto_2
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->getPreferredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 741
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         -0x80000000 -> :sswitch_0
a=0;//         0x0 -> :sswitch_2
a=0;//         0x40000000 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method onQueryRefine(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "queryText"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 872
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 873
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method onTextFocusChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1252
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->isIconified()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->updateViewsVisibility(Z)V
a=0;// 
a=0;//     .line 1255
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->postUpdateFocusedState()V
a=0;// 
a=0;//     .line 1256
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->hasFocus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1257
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->forceSuggestionQuery()V
a=0;// 
a=0;//     .line 1259
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onWindowFocusChanged(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "hasWindowFocus"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1263
a=0;//     invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onWindowFocusChanged(Z)V
a=0;// 
a=0;//     .line 1265
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->postUpdateFocusedState()V
a=0;// 
a=0;//     .line 1266
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public requestFocus(ILandroid/graphics/Rect;)Z
a=0;//     .locals 3
a=0;//     .param p1, "direction"    # I
a=0;//     .param p2, "previouslyFocusedRect"    # Landroid/graphics/Rect;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 442
a=0;//     #v1=(Null);
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mClearingFocus:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 453
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 444
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->isFocusable()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 446
a=0;//     :cond_2
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->isIconified()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 447
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v2, p1, p2}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->requestFocus(ILandroid/graphics/Rect;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 448
a=0;//     .local v0, "result":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 449
a=0;//     invoke-direct {p0, v1}, Lcom/actionbarsherlock/widget/SearchView;->updateViewsVisibility(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 453
a=0;//     .end local v0    # "result":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Boolean);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->requestFocus(ILandroid/graphics/Rect;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAppSearchData(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "appSearchData"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mAppSearchData:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 391
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIconified(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "iconify"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 619
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 620
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->onCloseClicked()V
a=0;// 
a=0;//     .line 624
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 622
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->onSearchClicked()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setIconifiedByDefault(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "iconified"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 592
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconifiedByDefault:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 596
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 593
a=0;//     :cond_0
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mIconifiedByDefault:Z
a=0;// 
a=0;//     .line 594
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/SearchView;->updateViewsVisibility(Z)V
a=0;// 
a=0;//     .line 595
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateQueryHint()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setImeOptions(I)V
a=0;//     .locals 1
a=0;//     .param p1, "imeOptions"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V
a=0;// 
a=0;//     .line 403
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInputType(I)V
a=0;//     .locals 1
a=0;//     .param p1, "inputType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setInputType(I)V
a=0;// 
a=0;//     .line 426
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMaxWidth(I)V
a=0;//     .locals 0
a=0;//     .param p1, "maxpixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 714
a=0;//     iput p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mMaxWidth:I
a=0;// 
a=0;//     .line 716
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->requestLayout()V
a=0;// 
a=0;//     .line 717
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnCloseListener(Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 483
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnCloseListener:Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;
a=0;// 
a=0;//     .line 484
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/view/View$OnFocusChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnQueryTextFocusChangeListener:Landroid/view/View$OnFocusChangeListener;
a=0;// 
a=0;//     .line 493
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnQueryTextListener(Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnQueryChangeListener:Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;
a=0;// 
a=0;//     .line 475
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnSearchClickListener(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 513
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnSearchClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 514
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnSuggestionListener(Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mOnSuggestionListener:Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;
a=0;// 
a=0;//     .line 502
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setQuery(Ljava/lang/CharSequence;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "query"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "submit"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 534
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 535
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 536
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setSelection(I)V
a=0;// 
a=0;//     .line 537
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mUserQuery:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 541
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 542
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->onSubmitQuery()V
a=0;// 
a=0;//     .line 544
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setQueryHint(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "hint"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 555
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 556
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateQueryHint()V
a=0;// 
a=0;//     .line 557
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setQueryRefinementEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "enable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 673
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryRefinement:Z
a=0;// 
a=0;//     .line 674
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     instance-of v0, v0, Lcom/actionbarsherlock/widget/SuggestionsAdapter;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 675
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/widget/SuggestionsAdapter;
a=0;// 
a=0;//     .line 676
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 675
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/SuggestionsAdapter;->setQueryRefinement(I)V
a=0;// 
a=0;//     .line 678
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 676
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SuggestionsAdapter;);v1=(Uninit);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setSearchableInfo(Landroid/app/SearchableInfo;)V
a=0;//     .locals 2
a=0;//     .param p1, "searchable"    # Landroid/app/SearchableInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 368
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     .line 369
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/SearchableInfo;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 370
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateSearchAutoComplete()V
a=0;// 
a=0;//     .line 371
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->updateQueryHint()V
a=0;// 
a=0;//     .line 374
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView;->hasVoiceSearch()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButtonEnabled:Z
a=0;// 
a=0;//     .line 376
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mVoiceButtonEnabled:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 379
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     const-string v1, "nm"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setPrivateImeOptions(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 381
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->isIconified()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->updateViewsVisibility(Z)V
a=0;// 
a=0;//     .line 382
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubmitButtonEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 645
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSubmitButtonEnabled:Z
a=0;// 
a=0;//     .line 646
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView;->isIconified()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/widget/SearchView;->updateViewsVisibility(Z)V
a=0;// 
a=0;//     .line 647
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSuggestionsAdapter(Landroid/support/v4/widget/CursorAdapter;)V
a=0;//     .locals 2
a=0;//     .param p1, "adapter"    # Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 695
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     .line 697
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView;->mQueryTextView:Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 698
a=0;//     return-void
a=0;// .end method
}}
