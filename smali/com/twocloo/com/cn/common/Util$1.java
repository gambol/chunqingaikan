package com.twocloo.com.cn.common; class Util$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/common/Util$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Util.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/FilenameFilter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/common/Util;->copy(Landroid/content/Context;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic val$ctx:Landroid/content/Context;
a=0;// 
a=0;// .field private final synthetic val$p:Ljava/util/regex/Pattern;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/util/regex/Pattern;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/Util$1;->val$p:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/common/Util$1;->val$ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 654
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/Util$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private insertDb(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "articid"    # Ljava/lang/String;
a=0;//     .param p2, "newPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 687
a=0;//     sget-object v1, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 688
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/Util$1;->val$ctx:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 689
a=0;//     .local v0, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 690
a=0;//     invoke-virtual {v0, p2, p1}, Lcom/twocloo/com/cn/db/DBAdapter;->updateSetBookFile(Ljava/lang/String;Ljava/lang/String;)J
a=0;// 
a=0;//     .line 691
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 692
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public accept(Ljava/io/File;Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;//     .param p1, "dir"    # Ljava/io/File;
a=0;//     .param p2, "filename"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 657
a=0;//     #v6=(Null);
a=0;//     const-string v3, "tempbook_text"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 659
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/Util$1;->val$p:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-virtual {v3, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 660
a=0;//     .local v0, "articid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 661
a=0;//     .local v2, "newPath":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/Util;->copyFile(Ljava/io/File;Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 683
a=0;//     .end local v0    # "articid":Ljava/lang/String;
a=0;//     .end local v2    # "newPath":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 662
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 663
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 665
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);
a=0;//     const-string v3, "book_text"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 667
a=0;//     :try_start_1
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/Util$1;->val$p:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-virtual {v3, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 668
a=0;//     .restart local v0    # "articid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 669
a=0;//     .restart local v2    # "newPath":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/Util;->copyFile(Ljava/io/File;Ljava/io/File;)V
a=0;// 
a=0;//     .line 670
a=0;//     invoke-direct {p0, v0, v2}, Lcom/twocloo/com/cn/common/Util$1;->insertDb(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 671
a=0;//     .end local v0    # "articid":Ljava/lang/String;
a=0;//     .end local v2    # "newPath":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 672
a=0;//     .restart local v1    # "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 674
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);
a=0;//     invoke-virtual {p2, v6}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 676
a=0;//     :try_start_2
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/Util$1;->val$p:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/regex/Pattern;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "_"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 677
a=0;//     .restart local v0    # "articid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 678
a=0;//     .restart local v2    # "newPath":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/Util;->copyFile(Ljava/io/File;Ljava/io/File;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 679
a=0;//     .end local v0    # "articid":Ljava/lang/String;
a=0;//     .end local v2    # "newPath":Ljava/lang/String;
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 680
a=0;//     .restart local v1    # "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
