package com.academysmart.vlad.Knight;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class KnightTest {
    
	@Test
	public void knightShouldEmbarkQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
    
}
